public class Oppejoud {
    String eesnimi;
    String perenimi;
    Kontaktandmed kontaktAndmed;

    public Oppejoud(String eesnimi, String perenimi, Kontaktandmed kontaktAndmed){
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.kontaktAndmed = kontaktAndmed;
    }

    public void muudaNimi(String uusEesnimi, String uusPerenimi){
        this.eesnimi = uusEesnimi;
        this.perenimi = uusPerenimi;
        System.out.println("Õppejõu nimi on muudetud!");
    }
}
