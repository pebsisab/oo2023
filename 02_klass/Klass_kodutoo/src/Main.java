public class Main {
    public static void main(String[] args) {
        Kursus Hulgateooria = new Kursus("Hulgateooria", "Malle Maasikas", 6);
        Kursus Matemaatika = new Kursus("Matemaatika", "Taavi Tuvi", 4);

        Hulgateooria.muudaKursus("Hulgateooria", "Kalle Kaalikas", 4);
        String muudatus = Matemaatika.kustutaKursus();
        System.out.println(muudatus);
    }
}