public class Kontaktandmed {
    String email;
    String telNr;

    public Kontaktandmed(String email, String telNr){
        this.email = email;
        this.telNr = telNr;
    }

    public void muudaKontaktandmed(String uusEmail, String uusTelNr){
        this.email = uusEmail;
        this.telNr = uusTelNr;
        System.out.println("Kontaktandmed on muudetud!");
    }
}
