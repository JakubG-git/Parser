package pl.edu.agh.kis;

import jakarta.xml.bind.JAXBException;

import java.io.IOException;
/**
 * Main class of the program
 */
public class Main {
    /**
     * Main method of the program
     * @param args command line arguments(not used)
     * @throws IOException if there is a problem with reading or writing files
     * @throws JAXBException if there is a problem with JAXB
     */
    public static void main(String[] args) throws IOException, JAXBException {
        Logging logger = new Logging(Main.class.getName());
        String path = "C:\\Users\\Jakub\\IdeaProjects\\Parser\\main\\src\\main\\resources\\test.csv";
        String path2 = "C:\\Users\\Jakub\\IdeaProjects\\Parser\\main\\src\\main\\resources\\test.xml";
        if (args.length == 2) {
            path = args[0];
            path2 = args[1];
        }
        else {
            logger.info("Usage: java -jar <jar file> <input file> <output file> \n");
        }
        Parser parser;

        if(path.endsWith(".csv")){
            parser = new Parser(path, '\t', true);
        }
        else if (path.endsWith(".xlsx")){
            parser = new Parser(path, '\t', false);
        }
        else {
            logger.error("Wrong file extension");
            return;
        }
        MarshalXML marshalXML = new MarshalXML(parser.saveToXML(), path2);
        marshalXML.marshalXML();
    }
}