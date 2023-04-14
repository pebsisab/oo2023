import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomaatTest {

    @Test
    public void kontrolli_kas_on_sygavkylmatoode_kui_alguses_on_SKT(){
        SygavkylmaToode toode = new SygavkylmaToode("SKT32418", "pirukas", "Viineripirukas");
        assertEquals("Sygavkylmiku toode", toode.getKategooria());
    }

    @Test
    public void kontrolli_kas_on_sygavkylmatoode_kui_alguses_on_KT(){
        KylmikuToode toode2 = new KylmikuToode("KT210307", "liha", "Sink");
        assertEquals("Külmikutoode", toode2.getKategooria());
    }

    @Test
    public void kontrolli_kas_on_sygavkylmatoode_kui_alguses_on_TT(){
        TavaToode toode3 = new TavaToode("60424TT", "liha", "Sink");
        assertEquals("Tavatoode", toode3.getKategooria());
    }

    @Test
    public void kontrolli_kas_temperatuur_on_miinus_24_kuni_miinus_18_kraadi(){
        SygavkylmaToode toode4 = new SygavkylmaToode("SKT42418", "soolane", "Pitsa");
        assertEquals("Temperatuurivahemik on -24 kuni -18 kraadi", toode4.getTemperatuur());
    }

    @Test
    public void kontrolli_kas_temperatuur_on_3_kuni_6_kraadi(){
        KylmikuToode toode5 = new KylmikuToode("KT510306", "piimatoode", "Juust");
        assertEquals("Temperatuurivahemik on +03 kuni +06 kraadi", toode5.getTemperatuur());
    }

    @Test
    public void kontrolli_kas_temperatuur_on_4_kuni_24_kraadi(){
        TavaToode toode6 = new TavaToode("60424TT", "kuivaine", "jahu");
        assertEquals("Temperatuurivahemik on +04 kuni +24 kraadi", toode6.getTemperatuur());
    }
}
