public class Kursus {
    String kursuseNimi;
    Oppejoud oppejoud;
    int EAP_punktid;
    boolean aktiivne;

    public Kursus (String kursuseNimi, Oppejoud oppejoud, int EAP_punktid){
        this.kursuseNimi = kursuseNimi;
        this.oppejoud = oppejoud;
        this.EAP_punktid = EAP_punktid;
        this.aktiivne = true;
    }
    public String kustutaKursus(){
        this.aktiivne = false;
        return "Kursus on kustutatud!";
    }
    public void muudaKursus(String uusNimi, int uusEAP){
        this.kursuseNimi = uusNimi;
        this.EAP_punktid = uusEAP;
        System.out.println("Kursus on muudetud!");
    }
}
