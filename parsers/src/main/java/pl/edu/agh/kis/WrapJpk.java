package pl.edu.agh.kis;

import pl.edu.agh.kis.generated.JPK;
import pl.edu.agh.kis.generated.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

public class WrapJpk {
    protected JPK jpk;
    Logging logger = new Logging(getClass().getName());

    public JPK getJpk() {
        return jpk;
    }

    public WrapJpk(){
        initJPK();
    }

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
        this.jpk.setNaglowek(header);
    }
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
}
