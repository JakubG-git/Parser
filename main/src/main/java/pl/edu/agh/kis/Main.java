package pl.edu.agh.kis;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import pl.edu.agh.kis.generated.JPK;

import java.io.File;
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
        Parser parser = new Parser("C:\\Users\\Jakub\\IdeaProjects\\Parser\\main\\src\\main\\resources\\test.csv", '\t', true);
        Invoice invoice = parser.saveToXML().getKey();
        parser.resetParser("C:\\Users\\Jakub\\IdeaProjects\\Parser\\main\\src\\main\\resources\\test.xlsx", '\t', false);
        Invoice invoice2 = (parser.saveToXML()).getKey();

        WrapJpk wrapJpk = new WrapJpk();
        JPK jpk = wrapJpk.getJpk();



        JAXBContext context = JAXBContext.newInstance(Invoice.class);
        JAXBContext context2 = JAXBContext.newInstance(JPK.class);
        Marshaller marshaller = context.createMarshaller();
        Marshaller marshaller2 = context2.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller2.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller2.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller2.marshal(jpk, new File("C:\\Users\\Jakub\\IdeaProjects\\Parser\\main\\src\\main\\resources\\testJPK.xml"));
        marshaller.marshal(invoice, new File("C:\\Users\\Jakub\\IdeaProjects\\Parser\\main\\target\\test.xml"));
        marshaller.marshal(invoice2, new File("C:\\Users\\Jakub\\IdeaProjects\\Parser\\main\\target\\test2.xml"));
    }
}