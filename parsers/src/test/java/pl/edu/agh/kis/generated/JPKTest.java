package pl.edu.agh.kis.generated;

import org.junit.jupiter.api.Test;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class JPKTest {
    @Test
    public void testJPK() {
        JPK jpk = new JPK();
        assertNotEquals(null, jpk);
        jpk.setNaglowek(new JPK.Naglowek());
        assertNotEquals(null, jpk.getNaglowek());
        jpk.setPodmiot1(new JPK.Podmiot1());
        assertNotEquals(null, jpk.getPodmiot1());
        jpk.setFakturaCtrl(new JPK.FakturaCtrl());
        assertNotEquals(null, jpk.getFakturaCtrl());
        jpk.setFakturaWierszCtrl(new JPK.FakturaWierszCtrl());
        assertNotEquals(null, jpk.getFakturaWierszCtrl());
        jpk.setZamowienieCtrl(new JPK.ZamowienieCtrl());
        assertNotEquals(null, jpk.getZamowienieCtrl());
        jpk.getFaktura().add(new JPK.Faktura());
        assertNotEquals(null, jpk.getFaktura());
        JPK.Zamowienie zamowienie = new JPK.Zamowienie();
        zamowienie.setP2AZ("cos");
        jpk.getZamowienie().add(zamowienie);
        assertNotEquals(null, jpk.getZamowienie());
        assertNotEquals(null, zamowienie.getP2AZ());
        zamowienie.setWartoscZamowienia(new BigDecimal(0));
        assertNotEquals(null, zamowienie.getWartoscZamowienia());
        JPK.Faktura faktura = new JPK.Faktura();
        faktura.setP3C("cos");
        jpk.getFaktura().add(faktura);
        assertNotEquals(null, jpk.getFaktura());
    }
    @Test
    public void testNaglowek() {
        JPK.Naglowek naglowek = new JPK.Naglowek();
        assertNotEquals(null, naglowek);
        naglowek.setKodFormularza(new JPK.Naglowek.KodFormularza());
        assertNotEquals(null, naglowek.getKodFormularza());
        naglowek.setWariantFormularza((byte) 3);
        assertNotEquals(null, naglowek.getKodFormularza() );
        naglowek.setCelZlozenia((byte) 1);
        naglowek.setKodUrzedu("2137");
        assertNotEquals(null, naglowek.getKodUrzedu());
    }
    @Test
    public void testFaktura(){
        JPK.Faktura invoice = new JPK.Faktura();
        assertNotEquals(null, invoice);
        invoice.setP3C("cos");
        assertNotEquals(null, invoice.getP3C());
        invoice.setP3C("cos");
        assertNotEquals(null, invoice.getP3C());
        invoice.setNrFaKorygowanej("cos");
        assertNotEquals(null, invoice.getNrFaKorygowanej());
        invoice.setKodWaluty(CurrCodeType.fromValue("PLN"));
        assertNotEquals(null, invoice.getKodWaluty());
        invoice.setNrFaZaliczkowej("cos");
        invoice.setOkresFaKorygowanej("cos");
        MSCurrCodeType.fromValue("PLN");
        CountryCodeExMSType.fromValue("YE");
        EULanguageCodeType.fromValue("pl");
        MSCurrCodeExPLNType.fromValue("BGN");
    }

    @Test
    public void testTPodmiotDowolny() {
        TPodmiotDowolny tPodmiotDowolny = new TPodmiotDowolny();
        assertNotEquals(null, tPodmiotDowolny);
        tPodmiotDowolny.setAdresZamieszkaniaSiedziby(new TPodmiotDowolny.AdresZamieszkaniaSiedziby());
        assertNotEquals(null, tPodmiotDowolny.getAdresZamieszkaniaSiedziby());
        tPodmiotDowolny.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznej());
        assertNotEquals(null, tPodmiotDowolny.getOsobaFizyczna());
        tPodmiotDowolny.setOsobaNiefizyczna(new TIdentyfikatorOsobyNiefizycznej());
        assertNotEquals(null, tPodmiotDowolny.getOsobaNiefizyczna());

    }
    @Test
    public void testTPodmiotDowolny1() {
        TPodmiotDowolny1 tPodmiotDowolny1 = new TPodmiotDowolny1();
        assertNotEquals(null, tPodmiotDowolny1);
        tPodmiotDowolny1.setAdresZamieszkaniaSiedziby(new TPodmiotDowolny1.AdresZamieszkaniaSiedziby());
        assertNotEquals(null, tPodmiotDowolny1.getAdresZamieszkaniaSiedziby());
        tPodmiotDowolny1.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznej());
        assertNotEquals(null, tPodmiotDowolny1.getOsobaFizyczna());
        tPodmiotDowolny1.setOsobaNiefizyczna(new TIdentyfikatorOsobyNiefizycznej());
        assertNotEquals(null, tPodmiotDowolny1.getOsobaNiefizyczna());
    }
    @Test
    public void testTPodmiotDowolny2() {
        TPodmiotDowolny2 tPodmiotDowolny2 = new TPodmiotDowolny2();
        assertNotEquals(null, tPodmiotDowolny2);
        tPodmiotDowolny2.setAdresZamieszkaniaSiedziby(new TPodmiotDowolny2.AdresZamieszkaniaSiedziby());
        assertNotEquals(null, tPodmiotDowolny2.getAdresZamieszkaniaSiedziby());
        tPodmiotDowolny2.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznej2());
        assertNotEquals(null, tPodmiotDowolny2.getOsobaFizyczna());
        tPodmiotDowolny2.setOsobaNiefizyczna(new TIdentyfikatorOsobyNiefizycznej1());
        assertNotEquals(null, tPodmiotDowolny2.getOsobaNiefizyczna());
    }

    @Test
    public void testTPodmiotDowolnyBezAdresu() {
        TPodmiotDowolnyBezAdresu tPodmiotDowolnyBezAdresu = new TPodmiotDowolnyBezAdresu();
        assertNotEquals(null, tPodmiotDowolnyBezAdresu);
        tPodmiotDowolnyBezAdresu.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznej());
        assertNotEquals(null, tPodmiotDowolnyBezAdresu.getOsobaFizyczna());

    }
    //1,2,3
    @Test
    public void testTPodmiotDowolnyBezAdresu2() {
        TPodmiotDowolnyBezAdresu2 tPodmiotDowolnyBezAdresu2 = new TPodmiotDowolnyBezAdresu2();
        assertNotEquals(null, tPodmiotDowolnyBezAdresu2);
        tPodmiotDowolnyBezAdresu2.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznej2());
        assertNotEquals(null, tPodmiotDowolnyBezAdresu2.getOsobaFizyczna());

    }
    @Test
    public void testTPodmiotDowolnyBezAdresu3() {
        TPodmiotDowolnyBezAdresu3 tPodmiotDowolnyBezAdresu3 = new TPodmiotDowolnyBezAdresu3();
        assertNotEquals(null, tPodmiotDowolnyBezAdresu3);
        tPodmiotDowolnyBezAdresu3.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznej2());
        assertNotEquals(null, tPodmiotDowolnyBezAdresu3.getOsobaFizyczna());

    }

    @Test
    public void testTPodmiotDowolnyPelny() {
        TPodmiotDowolnyPelny tPodmiotDowolnyPelny = new TPodmiotDowolnyPelny();
        assertNotEquals(null, tPodmiotDowolnyPelny);
        tPodmiotDowolnyPelny.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznejPelny());
        assertNotEquals(null, tPodmiotDowolnyPelny.getOsobaFizyczna());
    }
    @Test
    public void testTPodmiotDowolnyPelny1(){
        TPodmiotDowolnyPelny1 tPodmiotDowolnyPelny1 = new TPodmiotDowolnyPelny1();
        assertNotEquals(null, tPodmiotDowolnyPelny1);
        tPodmiotDowolnyPelny1.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznejPelny());
        assertNotEquals(null, tPodmiotDowolnyPelny1.getOsobaFizyczna());
    }

    @Test
    public void testTAdres() {
        TAdres tAdres = new TAdres();
        assertNotEquals(null, tAdres);
        tAdres.setAdresPol(new TAdresPolski());
        assertNotEquals(null, tAdres.getAdresPol());
        tAdres.setAdresZagr(new TAdresZagraniczny());
        assertNotEquals(null, tAdres.getAdresZagr());

    }
    @Test
    public void testTAdresPolski() {
        TAdresPolski tAdresPolski = new TAdresPolski();
        assertNotEquals(null, tAdresPolski);
        tAdresPolski.setKodKraju(TKodKraju.PL);
        assertNotEquals(null, tAdresPolski.getKodKraju());
        tAdresPolski.setKodPocztowy("00-000");
        assertNotEquals(null, tAdresPolski.getKodPocztowy());
        tAdresPolski.setMiejscowosc("Miejscowosc");
        assertNotEquals(null, tAdresPolski.getMiejscowosc());
        tAdresPolski.setUlica("Ulica");
        assertNotEquals(null, tAdresPolski.getUlica());
        tAdresPolski.setNrDomu("1");
        assertNotEquals(null, tAdresPolski.getNrDomu());
        tAdresPolski.setNrLokalu("1");
        assertNotEquals(null, tAdresPolski.getNrLokalu());
        tAdresPolski.setPoczta("Poczta");
        assertNotEquals(null, tAdresPolski.getPoczta());
        tAdresPolski.setPowiat("Powiat");
        assertNotEquals(null, tAdresPolski.getPowiat());
        tAdresPolski.setGmina("Gmina");
        assertNotEquals(null, tAdresPolski.getGmina());
        tAdresPolski.setWojewodztwo("Wojewodztwo");
        assertNotEquals(null, tAdresPolski.getWojewodztwo());
    }
    @Test
    public void testTAdresZagraniczny() {
        TAdresZagraniczny tAdresZagraniczny = new TAdresZagraniczny();
        assertNotEquals(null, tAdresZagraniczny);
        tAdresZagraniczny.setKodKraju(TKodKraju.PL);
        assertNotEquals(null, tAdresZagraniczny.getKodKraju());
        tAdresZagraniczny.setKodPocztowy("00-000");
        assertNotEquals(null, tAdresZagraniczny.getKodPocztowy());
        tAdresZagraniczny.setMiejscowosc("Miejscowosc");
        assertNotEquals(null, tAdresZagraniczny.getMiejscowosc());
        tAdresZagraniczny.setUlica("Ulica");
        assertNotEquals(null, tAdresZagraniczny.getUlica());
        tAdresZagraniczny.setNrDomu("1");
        assertNotEquals(null, tAdresZagraniczny.getNrDomu());
        tAdresZagraniczny.setNrLokalu("1");
        assertNotEquals(null, tAdresZagraniczny.getNrLokalu());


    }
    @Test
    public void testTIdentyfikatorOsobyNiefizycznej() {
        TIdentyfikatorOsobyNiefizycznej tIdentyfikatorOsobyNiefizycznej = new TIdentyfikatorOsobyNiefizycznej();
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznej);
        tIdentyfikatorOsobyNiefizycznej.setNIP("1234567890");
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznej.getNIP());
        tIdentyfikatorOsobyNiefizycznej.setREGON("123456789");
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznej.getREGON());
        tIdentyfikatorOsobyNiefizycznej.setPelnaNazwa("PelnaNazwa");
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznej.getPelnaNazwa());
    }
    @Test
    public void testTIdentyfikatorOsobyNiefizycznej1() {
        TIdentyfikatorOsobyNiefizycznej1 tIdentyfikatorOsobyNiefizycznej1 = new TIdentyfikatorOsobyNiefizycznej1();
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznej1);
        tIdentyfikatorOsobyNiefizycznej1.setNIP("1234567890");
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznej1.getNIP());
        tIdentyfikatorOsobyNiefizycznej1.setPelnaNazwa("PelnaNazwa");
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznej1.getPelnaNazwa());
    }
    @Test
    public void testTIdentyfikatorOsobyNiefizycznejPelny(){
        TIdentyfikatorOsobyNiefizycznejPelny tIdentyfikatorOsobyNiefizycznejPelny = new TIdentyfikatorOsobyNiefizycznejPelny();
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznejPelny);
        tIdentyfikatorOsobyNiefizycznejPelny.setNIP("1234567890");
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznejPelny.getNIP());
        tIdentyfikatorOsobyNiefizycznejPelny.setREGON("123456789");
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznejPelny.getREGON());
        tIdentyfikatorOsobyNiefizycznejPelny.setPelnaNazwa("PelnaNazwa");
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznejPelny.getPelnaNazwa());
        tIdentyfikatorOsobyNiefizycznejPelny.setSkroconaNazwa("SkroconaNazwa");
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznejPelny.getSkroconaNazwa());
    }
    @Test
    public void testTIdentyfikatorOsobyNiefizycznejZagranicznej(){
        TIdentyfikatorOsobyNiefizycznejZagranicznej tIdentyfikatorOsobyNiefizycznejZagranicznej = new TIdentyfikatorOsobyNiefizycznejZagranicznej();
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznejZagranicznej);
        tIdentyfikatorOsobyNiefizycznejZagranicznej.setPelnaNazwa("PelnaNazwa");
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznejZagranicznej.getPelnaNazwa());
        tIdentyfikatorOsobyNiefizycznejZagranicznej.setNIP("1234567890");
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznejZagranicznej.getNIP());
        tIdentyfikatorOsobyNiefizycznejZagranicznej.setSkroconaNazwa("SkroconaNazwa");
        assertNotEquals(null, tIdentyfikatorOsobyNiefizycznejZagranicznej.getSkroconaNazwa());
    }
    @Test
    public void testTIdentyfikatorOsobyFizycznej() throws DatatypeConfigurationException {
        TIdentyfikatorOsobyFizycznej tIdentyfikatorOsobyFizycznej = new TIdentyfikatorOsobyFizycznej();
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej);
        tIdentyfikatorOsobyFizycznej.setImiePierwsze("ImiePierwsze");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej.getImiePierwsze());
        tIdentyfikatorOsobyFizycznej.setNazwisko("Nazwisko");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej.getNazwisko());
        tIdentyfikatorOsobyFizycznej.setPESEL("12345678901");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej.getPESEL());
        tIdentyfikatorOsobyFizycznej.setDataUrodzenia(
                DatatypeFactory
                        .newInstance()
                        .newXMLGregorianCalendar("2022-10-12"));
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej.getDataUrodzenia());
        tIdentyfikatorOsobyFizycznej.setNIP("1234567890");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej.getNIP());
    }
    @Test
    public void testTIdentyfikatorOsobyFizycznej1() throws DatatypeConfigurationException {
        TIdentyfikatorOsobyFizycznej1 tIdentyfikatorOsobyFizycznej1 = new TIdentyfikatorOsobyFizycznej1();
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej1);
        tIdentyfikatorOsobyFizycznej1.setImiePierwsze("ImiePierwsze");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej1.getImiePierwsze());
        tIdentyfikatorOsobyFizycznej1.setNazwisko("Nazwisko");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej1.getNazwisko());
        tIdentyfikatorOsobyFizycznej1.setPESEL("12345678901");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej1.getPESEL());
        tIdentyfikatorOsobyFizycznej1.setNIP("1234567890");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej1.getNIP());
        tIdentyfikatorOsobyFizycznej1.setDataUrodzenia(
                DatatypeFactory
                        .newInstance()
                        .newXMLGregorianCalendar("2022-10-12"));
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej1.getDataUrodzenia());
    }
    @Test
    public void testTIdentyfikatorOsobyFizycznej2() throws DatatypeConfigurationException {
        TIdentyfikatorOsobyFizycznej2 tIdentyfikatorOsobyFizycznej2 = new TIdentyfikatorOsobyFizycznej2();
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej2);
        tIdentyfikatorOsobyFizycznej2.setImiePierwsze("ImiePierwsze");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej2.getImiePierwsze());
        tIdentyfikatorOsobyFizycznej2.setNazwisko("Nazwisko");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej2.getNazwisko());
        tIdentyfikatorOsobyFizycznej2.setNIP("1234567890");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej2.getNIP());
        tIdentyfikatorOsobyFizycznej2.setDataUrodzenia(
                DatatypeFactory
                        .newInstance()
                        .newXMLGregorianCalendar("2022-10-12"));
        assertNotEquals(null, tIdentyfikatorOsobyFizycznej2.getDataUrodzenia());
    }
    @Test
    public void testTIdentyfikatorOsobyFizycznejPelny() throws DatatypeConfigurationException {
        TIdentyfikatorOsobyFizycznejPelny tIdentyfikatorOsobyFizycznejPelny = new TIdentyfikatorOsobyFizycznejPelny();
        assertNotEquals(null, tIdentyfikatorOsobyFizycznejPelny);
        tIdentyfikatorOsobyFizycznejPelny.setImiePierwsze("ImiePierwsze");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznejPelny.getImiePierwsze());
        tIdentyfikatorOsobyFizycznejPelny.setNazwisko("Nazwisko");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznejPelny.getNazwisko());
        tIdentyfikatorOsobyFizycznejPelny.setNIP("1234567890");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznejPelny.getNIP());
        tIdentyfikatorOsobyFizycznejPelny.setDataUrodzenia(
                DatatypeFactory
                        .newInstance()
                        .newXMLGregorianCalendar("2022-10-12"));
        assertNotEquals(null, tIdentyfikatorOsobyFizycznejPelny.getDataUrodzenia());
        tIdentyfikatorOsobyFizycznejPelny.setPESEL("12345678901");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznejPelny.getPESEL());
        tIdentyfikatorOsobyFizycznejPelny.setImieMatki("ImieMatki");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznejPelny.getImieMatki());
        tIdentyfikatorOsobyFizycznejPelny.setImieOjca("ImieOjca");
        assertNotEquals(null, tIdentyfikatorOsobyFizycznejPelny.getImieOjca());
    }
    @Test
    public void testTOsobaFizyczna(){
        TOsobaFizyczna tOsobaFizyczna = new TOsobaFizyczna();
        assertNotEquals(null, tOsobaFizyczna);
        tOsobaFizyczna.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznej());
        assertNotEquals(null, tOsobaFizyczna.getOsobaFizyczna());
        tOsobaFizyczna.setAdresZamieszkania(new TOsobaFizyczna.AdresZamieszkania());
        assertNotEquals(null, tOsobaFizyczna.getAdresZamieszkania());
    }
    @Test
    public void testTOsobaFizyczna1(){
        TOsobaFizyczna1 tOsobaFizyczna1 = new TOsobaFizyczna1();
        assertNotEquals(null, tOsobaFizyczna1);
        tOsobaFizyczna1.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznej1());
        assertNotEquals(null, tOsobaFizyczna1.getOsobaFizyczna());
        tOsobaFizyczna1.setAdresZamieszkania(new TOsobaFizyczna1.AdresZamieszkania());
        assertNotEquals(null, tOsobaFizyczna1.getAdresZamieszkania());
    }
    @Test
    public void testTOsobaFizyczna2(){
        TOsobaFizyczna2 tOsobaFizyczna2 = new TOsobaFizyczna2();
        assertNotEquals(null, tOsobaFizyczna2);
        tOsobaFizyczna2.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznej2());
        assertNotEquals(null, tOsobaFizyczna2.getOsobaFizyczna());
        tOsobaFizyczna2.setAdresZamieszkania(new TOsobaFizyczna2.AdresZamieszkania());
        assertNotEquals(null, tOsobaFizyczna2.getAdresZamieszkania());
    }
    @Test
    public void testTOsobaFizyczna3(){
        TOsobaFizyczna3 tOsobaFizyczna3 = new TOsobaFizyczna3();
        assertNotEquals(null, tOsobaFizyczna3);
        tOsobaFizyczna3.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznej1());
        assertNotEquals(null, tOsobaFizyczna3.getOsobaFizyczna());
        tOsobaFizyczna3.setAdresZamieszkania(new TOsobaFizyczna3.AdresZamieszkania());
        assertNotEquals(null, tOsobaFizyczna3.getAdresZamieszkania());
    }
    @Test
    public void testTOsobaFizyczna4(){
        TOsobaFizyczna4 tOsobaFizyczna4 = new TOsobaFizyczna4();
        assertNotEquals(null, tOsobaFizyczna4);
        tOsobaFizyczna4.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznej2());
        assertNotEquals(null, tOsobaFizyczna4.getOsobaFizyczna());
        tOsobaFizyczna4.setAdresZamieszkania(new TOsobaFizyczna4.AdresZamieszkania());
        assertNotEquals(null, tOsobaFizyczna4.getAdresZamieszkania());
    }
    @Test
    public void testTOsobaFizyczna5(){
        TOsobaFizyczna5 tOsobaFizyczna5 = new TOsobaFizyczna5();
        assertNotEquals(null, tOsobaFizyczna5);
        tOsobaFizyczna5.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznej());
        assertNotEquals(null, tOsobaFizyczna5.getOsobaFizyczna());
        tOsobaFizyczna5.setAdresZamieszkania(new TOsobaFizyczna5.AdresZamieszkania());
        assertNotEquals(null, tOsobaFizyczna5.getAdresZamieszkania());
    }

    @Test
    public void testTOsobaFizycznaPelna(){
        TOsobaFizycznaPelna tOsobaFizycznaPelna = new TOsobaFizycznaPelna();
        assertNotEquals(null, tOsobaFizycznaPelna);
        tOsobaFizycznaPelna.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznejPelny());
        assertNotEquals(null, tOsobaFizycznaPelna.getOsobaFizyczna());
        tOsobaFizycznaPelna.setAdresZamieszkania(new TOsobaFizycznaPelna.AdresZamieszkania());
        assertNotEquals(null, tOsobaFizycznaPelna.getAdresZamieszkania());
    }
    @Test
    public void testTOsobaFizycznaPelna1(){
        TOsobaFizycznaPelna1 tOsobaFizycznaPelna1 = new TOsobaFizycznaPelna1();
        assertNotEquals(null, tOsobaFizycznaPelna1);
        tOsobaFizycznaPelna1.setOsobaFizyczna(new TIdentyfikatorOsobyFizycznejPelny());
        assertNotEquals(null, tOsobaFizycznaPelna1.getOsobaFizyczna());
        tOsobaFizycznaPelna1.setAdresZamieszkania(new TOsobaFizycznaPelna1.AdresZamieszkania());
        assertNotEquals(null, tOsobaFizycznaPelna1.getAdresZamieszkania());
    }


}
