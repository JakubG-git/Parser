package pl.edu.agh.kis;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.math3.util.Pair;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Class responsible for parsing CSV and XLSX files
 * @author Jakub Głowacki
 */
public class Parser {
    protected Reader in;
    protected Iterable<CSVRecord> records;
    protected CSVFormat csvFormat;
    protected Workbook workbook;
    protected Sheet sheet;

    protected Logging logger = new Logging(Parser.class.getName());
    protected ArrayList<String> headerNames = new ArrayList<>();

    protected boolean isCSV;

    /**
     * Parser initialization
     * @param path - path to file
     * @param delimiter - delimiter used in CSV file
     * @param csv - true if file is CSV, false if file is XLSX
     * @throws IOException - thrown when file is not found
     */
    private void initParser(String path, char delimiter, boolean csv) throws IOException {
        isCSV = csv;
        if(csv){
            buildCsvFormat(delimiter);
            loadCsv(path);
        }
        else{
            loadXlsx(path);
        }
        getHeaderNames(csv);
    }

    /**
     * Builds CSVFormat object
     * @param delimiter - delimiter used in CSV file
     */
    private void buildCsvFormat(char delimiter){
        csvFormat = CSVFormat.Builder.create(CSVFormat.EXCEL)
                .setDelimiter(delimiter)
                .build();
    }

    /**
     * Loads CSV file
     * @param path - path to file
     * @throws IOException - if file not found
     */
    private void loadCsv(String path) throws IOException {
        in = new FileReader(path, StandardCharsets.UTF_8);
        records = csvFormat.parse(in);
    }

    /**
     * Loads XLSX file
     * @param path - path to file
     * @throws IOException - if file not found
     */
    private void loadXlsx(String path) throws IOException {
        workbook = new XSSFWorkbook(path);
        sheet = workbook.getSheetAt(0);
    }

    /**
     * Gets header names from file
     * @param csv - true if file is CSV, false if file is XLSX
     */
    private void getHeaderNames(boolean csv) {
        if (csv) {
            records.iterator().next().forEach(headerNames::add);
        } else {
            Row row = sheet.getRow(0);
            for (int i = 0; i < row.getLastCellNum(); i++) {
                headerNames.add(row.getCell(i).getStringCellValue());
            }
            sheet.removeRow(row);
        }
    }

    /**
     * Clears all data from class, used when parsing multiple files
     */
    private void clearAllData(){
        headerNames.clear();
        if(isCSV){
            try {
                in.close();
            } catch (IOException e) {
                logger.error(e.getMessage());
            }
        }
        else{
            try {
                workbook.close();
            } catch (IOException e) {
                logger.error(e.getMessage());
            }
        }
    }


    /**
     * Resets parser to initial state and loads new file
     * @param path - path to file
     * @param delimiter - delimiter used in CSV file
     * @param csv - true if file is CSV, false if file is XLSX
     * @throws IOException - thrown when file is not found
     */
    public void resetParser(String path, char delimiter, boolean csv) throws IOException {
        clearAllData();
        initParser(path, delimiter, csv);
    }

    /**
     * Constructor for Parser class
     * @param path - path to file
     * @param delimiter - delimiter used in CSV file
     * @param csv - true if file is CSV, false if file is XLSX
     * @throws IOException - thrown when file is not found
     */
    public Parser(String path, char delimiter, boolean csv) throws IOException {
        this.isCSV = csv;
        initParser(path, delimiter, csv);
    }

    /**
     * Gett data from singe cell
     * @param cell - cell to get data from
     * @return - data from cell(String)
     */
    private String getCellValue(Cell cell){
        if(cell == null){
            return "";
        }
        switch (cell.getCellType()){
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return (new SimpleDateFormat("yyyy-MM-dd")
                            .format(cell.getDateCellValue())
                            .trim());
                } else {
                    return cell.toString();
                }
            default:
                return cell.toString();
        }
    }

    private Pair<ArrayList<Company>, ArrayList<InvoiceRow>> parseCSV(HashSet<String> invoiceNum,
                                                                     InvoiceSummary invoiceSummary,
                                                                     InvoiceSummary invoiceSummary2){
        ArrayList<Company> companies = new ArrayList<>();
        ArrayList<InvoiceRow> invoiceRows = new ArrayList<>();
        for (CSVRecord record_ : records) {
            InvoiceRow invoiceRow = new InvoiceRow();
            Company company = new Company();
            for (int i = 0; i < headerNames.size(); i++) {
                company.appendData(headerNames.get(i), record_.get(i));
                if (i == 12) {
                    invoiceSummary.appendData(record_.get(i));
                }
                if (i == 11){
                    invoiceSummary2.appendData(record_.get(i));
                    invoiceRow.appendData(i, record_.get(i));
                }
                if(i == 5){
                    invoiceNum.add(record_.get(i));
                }
                if ((i >= 5 && i <= 9)) {
                    invoiceRow.appendData(i, record_.get(i));
                }
            }
            companies.add(company);
            invoiceRows.add(invoiceRow);
        }
        return new Pair<>(companies, invoiceRows);
    }

    private Pair<ArrayList<Company>, ArrayList<InvoiceRow>> parseXLSX(HashSet<String> invoiceNum,
                                                                     InvoiceSummary invoiceSummary,
                                                                     InvoiceSummary invoiceSummary2){
        ArrayList<Company> companies = new ArrayList<>();
        ArrayList<InvoiceRow> invoiceRows = new ArrayList<>();
        for (Row row : sheet) {
            InvoiceRow invoiceRow = new InvoiceRow();
            Company company = new Company();
            for (int i = 0; i < headerNames.size(); i++) {
                company.appendData(headerNames.get(i), getCellValue(row.getCell(i)));
                if (i == 12) {
                    invoiceSummary.appendData(getCellValue(row.getCell(i)));
                }
                if (i == 11){
                    invoiceSummary2.appendData(getCellValue(row.getCell(i)));
                    invoiceRow.appendData(i, getCellValue(row.getCell(i)));
                }
                if(i == 5){
                    invoiceNum.add(getCellValue(row.getCell(i)));
                }
                if ((i >= 5 && i <= 9)) {
                    invoiceRow.appendData(i, getCellValue(row.getCell(i)));
                }
            }
            companies.add(company);
            invoiceRows.add(invoiceRow);
        }
        return new Pair<>(companies, invoiceRows);
    }

    /**
     * Saves parsed data to XML file
     * @return - Invoice object
     */
    public Invoice saveToXML(){
        ArrayList<Company> companies;
        ArrayList<InvoiceRow> invoiceRows;
        InvoiceSummary invoiceSummary = new InvoiceSummary();
        InvoiceSummary invoiceSummary2 = new InvoiceSummary();
        HashSet<String> invoiceNum = new HashSet<>();
        Pair<ArrayList<Company>, ArrayList<InvoiceRow>> pair;
        if(isCSV){
            pair = parseCSV(invoiceNum, invoiceSummary, invoiceSummary2);
        } else {
            pair = parseXLSX(invoiceNum, invoiceSummary, invoiceSummary2);
        }
        companies = pair.getKey();
        invoiceRows = pair.getValue();
        invoiceSummary.setNumberOfInvoices(invoiceNum.size());
        return new Invoice(companies, invoiceSummary, invoiceRows, invoiceSummary2);
    }
}
