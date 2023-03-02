public class Kursus {
    String kursuseNimi;
    String oppejouNimi;
    int EAP_punktid;
    boolean aktiivne;

    public Kursus (String kursuseNimi, String oppejouNimi, int EAP_punktid){
        this.kursuseNimi = kursuseNimi;
        this.oppejouNimi = oppejouNimi;
        this.EAP_punktid = EAP_punktid;
        this.aktiivne = true;
    }
    public String kustutaKursus(){
        this.aktiivne = false;
        return "Kursus on kustutatud!";
    }
    public void muudaKursus(String uusNimi, String uusOppejoud, int uusEAP){
        this.kursuseNimi = uusNimi;
        this.oppejouNimi = uusOppejoud;
        this.EAP_punktid = uusEAP;
        System.out.println("Kursus on muudetud!");
    }
}
