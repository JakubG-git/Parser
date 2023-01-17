package pl.edu.agh.kis;

import pl.edu.agh.kis.generated.JPK;
import pl.edu.agh.kis.generated.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

/**
 * Wrapper class for JPK
 * @author Jakub Głowacki
 */
public class WrapJpk {
    protected JPK jpk;
    Logging logger = new Logging(getClass().getName());

    /**
     * Getter for JPK
     * @return JPK
     */
    public JPK getJpk() {
        return jpk;
    }

    /**
     * Constructor for WrapJpk
     */
    public WrapJpk(){
        initJPK();
    }

    /**
     * Initializer for JPK
     */
    private void initJPK(){
        this.jpk = new JPK();
        jpk.setNaglowek(new JPK.Naglowek());
        jpk.getNaglowek().setKodFormularza(new TNaglowek.KodFormularza());
        jpk.setPodmiot1(new JPK.Podmiot1());

        jpk.setFakturaCtrl(new JPK.FakturaCtrl());
        jpk.getFakturaCtrl().setLiczbaFaktur(BigInteger.ZERO);
        jpk.getFakturaCtrl().setWartoscFaktur(BigDecimal.ZERO);

        jpk.setFakturaWierszCtrl(new JPK.FakturaWierszCtrl());
        jpk.getFakturaWierszCtrl().setLiczbaWierszyFaktur(BigInteger.ZERO);
        jpk.getFakturaWierszCtrl().setWartoscWierszyFaktur(BigDecimal.ZERO);
        try {
            initHeader();
        } catch (DatatypeConfigurationException e) {
            logger.error(e.getMessage());
        }
        initSubject();
    }

    /**
     * Initializer for header
     * @throws DatatypeConfigurationException if date is invalid
     */
    private void initHeader() throws DatatypeConfigurationException {
        JPK.Naglowek header = this.jpk.getNaglowek();
        header.setKodFormularza(new TNaglowek.KodFormularza());
        header.getKodFormularza().setValue(TKodFormularza.fromValue("JPK_FA"));
        header.getKodFormularza().setKodSystemowy("JPK_FA (3)");
        header.getKodFormularza().setWersjaSchemy("1-0");
        header.setWariantFormularza((byte) 3);
        header.setCelZlozenia((byte) 1);
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(new Date());
        XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        header.setDataWytworzeniaJPK(date);
        header.setKodUrzedu("2137");
        this.jpk.setNaglowek(header);
    }

    /**
     * Initializer for subject
     */
    private void initSubject() {
        JPK.Podmiot1 subject = this.jpk.getPodmiot1();
        TIdentyfikatorOsobyNiefizycznej1 id = new TIdentyfikatorOsobyNiefizycznej1();
        id.setNIP("21374202137");
        id.setPelnaNazwa("Radio Maryja");
        subject.setIdentyfikatorPodmiotu(id);
        TAdresPolski1 adress = new TAdresPolski1();
        adress.setKodKraju(TKodKraju.fromValue("PL"));
        adress.setWojewodztwo("Kujawsko-Pomorskie");
        adress.setMiejscowosc("Toruń");
        adress.setKodPocztowy("87-100");
        adress.setGmina("Toruń");
        adress.setPowiat("m. Toruń");
        adress.setUlica("ul. Żwirki i Wigury 80");
        adress.setNrDomu("80");
        adress.setNrLokalu("1");
        subject.setAdresPodmiotu(adress);
        this.jpk.setPodmiot1(subject);
    }

    /**
     * Helper method for converting string to XMLGregorianCalendar
     * @param str string to convert
     * @return XMLGregorianCalendar
     * @throws DatatypeConfigurationException if there is a problem with conversion
     */
    private XMLGregorianCalendar toXMLGregorian(String str) throws DatatypeConfigurationException {
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(str);
    }

    /**
     * Helper method for converting string to BigDecimal
     * @param str string to convert
     * @return BigDecimal
     */
    private BigDecimal toBigDecimal(String str) {
        str = str.replaceAll("[^0-9.,]", "")
                .replace(",", ".")
                .replace(" ", "");
        return new BigDecimal(str);
    }

    /**
     * Method for adding invoiceCtrl to JPK
     * @param summary invoiceCtrl to add
     */
    public void addFakturaCtrl(InvoiceSummary summary){
        JPK.FakturaCtrl ctrl = this.jpk.getFakturaCtrl();
        ctrl.setLiczbaFaktur(BigInteger.valueOf(summary.getNumberOfInvoices()));
        ctrl.setWartoscFaktur(summary.getTotalValue());
        this.jpk.setFakturaCtrl(ctrl);
    }

    /**
     * Method for adding invoiceRows to JPK
     * @param invoiceRows invoiceRows to add
     */
    public void addFakturaRows(List<InvoiceRow> invoiceRows){

        ArrayList<JPK.FakturaWiersz> rows = new ArrayList<>();
        for(InvoiceRow row : invoiceRows) {
            JPK.FakturaWiersz fkRow = new JPK.FakturaWiersz();
            fkRow.setP2B(row.getInvoiceNumber());
            fkRow.setP7(row.getInvoiceDescription());
            fkRow.setP8A("szt");
            fkRow.setP8B(row.getAmountOfGoods());
            fkRow.setP9A(row.getPricePerGood());
            fkRow.setP9B(row.getPricePerGoodBrutto());
            fkRow.setP11(row.getNetValue());
            fkRow.setP12(row.getTaxRate());
            rows.add(fkRow);
        }
        this.jpk.getFakturaWiersz().addAll(rows);
    }

    /**
     * Method for adding invoiceRowCtrl to JPK
     * @param summary invoiceRowCtrl to add
     */
    public void addFakturaWierszCtrl(InvoiceSummary summary){
        JPK.FakturaWierszCtrl ctrl = this.jpk.getFakturaWierszCtrl();
        ctrl.setLiczbaWierszyFaktur(BigInteger.valueOf(summary.getNumberOfInvoices()));
        ctrl.setWartoscWierszyFaktur(summary.getTotalValue());
        this.jpk.setFakturaWierszCtrl(ctrl);
    }

    /**
     * Method for adding invoice to JPK
     * @param companies list of companies(invoices)
     */
    public void addFaktura(List<Company> companies){
        ArrayList<JPK.Faktura> invoices = new ArrayList<>();
        for(Company company : companies){
            JPK.Faktura invoice = new JPK.Faktura();
            HashMap<String, String> map = company.getInvoiceDetails();
            invoice.setKodWaluty(CurrCodeType.PLN);
            invoice.setP2A(map.get("Nr faktury"));
            invoice.setP3A(map.get("Nazwa odbiorcy"));
            invoice.setP3B(map.get("Nazwa odbiorcy") + "-ADDRESS");
            invoice.setP3C(this.jpk.getPodmiot1().getIdentyfikatorPodmiotu().getPelnaNazwa());
            invoice.setP3D(map.get("Adres odbiorcy"));
            invoice.setP4A(MSCountryCodeType.PL);
            invoice.setP4B(this.jpk.getPodmiot1().getIdentyfikatorPodmiotu().getNIP());
            invoice.setP5B(map.get("NIP odbiorcy"));
            invoice.setP131(toBigDecimal(map.get("Cena jednostkowa")));
            invoice.setP141(toBigDecimal(map.get("Kwota Podatku")));
            invoice.setP15(toBigDecimal((map.get("Cena brutto faktury łącznie"))));

            try {
                invoice.setP1(toXMLGregorian(map.get("Data wystawienia")));
                invoice.setP6(toXMLGregorian(map.get("Data sprzedaży")));
            } catch (DatatypeConfigurationException e) {
                logger.error("Error while parsing date" + e.getMessage());
            }
            invoices.add(invoice);
        }
        this.jpk.getFaktura().addAll(invoices);
    }


}
