public class Main {
    public static void main(String[] args) {
        //Kursus nr1 = new Kursus("Hulgateooria", "Malle Maasikas", 6);
        //Kursus nr2 = new Kursus("Matemaatika", "Taavi Tuvi", 4);

        //nr1.muudaKursus("Hulgateooria", "Kalle Kaalikas", 4);
        //String muudatus = nr2.kustutaKursus();
        //System.out.println(muudatus);

        Oppejoud malle = new Oppejoud("Malle", "Maasikas", new Kontaktandmed("malle@maasikas.ee", "53535353"));
        Oppejoud mart = new Oppejoud("Mart", "Martinson", new Kontaktandmed("mart@marti.ee", "56565656"));

        Kursus nr1 = new Kursus("Matemaarika", malle, 4);
        Kursus nr2 = new Kursus("Bioloogia", mart, 6);

        System.out.println(malle.kontaktAndmed.email);
        malle.kontaktAndmed.muudaKontaktandmed("mallle@maasikas.tlu.ee", "55550000");
        mart.muudaNimi("Mati", "Kask");

    }
}