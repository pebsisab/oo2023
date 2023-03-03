public class Main {
    public static void main(String[] args) {
        Kursus nr1 = new Kursus("Hulgateooria", "Malle Maasikas", 6);
        Kursus nr2 = new Kursus("Matemaatika", "Taavi Tuvi", 4);

        nr1.muudaKursus("Hulgateooria", "Kalle Kaalikas", 4);
        String muudatus = nr2.kustutaKursus();
        System.out.println(muudatus);
    }
}