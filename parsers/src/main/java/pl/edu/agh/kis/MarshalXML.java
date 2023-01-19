package pl.edu.agh.kis;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.apache.commons.math3.util.Pair;
import pl.edu.agh.kis.generated.JPK;

import java.io.File;

/**
 * Class responsible for savin xml
 */
public class MarshalXML {
    Invoice invoice;
    JPK jpk;
    String path;

    /**
     * Construktor for marshal class
     * @param pair - pair of Invoice, Jpk
     * @param path - path to file(to save)
     */
    public MarshalXML(Pair<Invoice, JPK> pair, String path) {
        this.invoice = pair.getKey();
        this.jpk = pair.getValue();
        this.path = path;
    }

    /**
     * Marshaller
     * @throws JAXBException - when contex can't be created
     */
    public void marshalXML() throws JAXBException {
        JAXBContext jaxbContext1 = JAXBContext.newInstance(JPK.class);

        Marshaller marshaller1 = jaxbContext1.createMarshaller();

        marshaller1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        marshaller1.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");


        marshaller1.marshal(jpk, new File(path));
    }
}
