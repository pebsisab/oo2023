public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        prindiForTsükkel(5);

        String hinnang = tempHinnang(-2.5);
        String hinnang2 = tempHinnang(4.7);
        System.out.println(hinnang);
        System.out.println(hinnang2);

        double summa = arvutaTaksoMaksumus(3.5);
        System.out.println(summa);

        double tulemus = kilogrammPoundiks(56.7);
        System.out.println(tulemus);

        String olek = happelisuseHinnang(4);
        System.out.println(olek);

        double hind = videoTootlemiseHind(3.5);
        System.out.println(hind);


    }
    // funkt 1
    private static double kilogrammPoundiks(double arv) {
        return 2.205*arv;
    }
    // funkt 2
    private static String happelisuseHinnang(int ph) {
        if (ph < 5) {
            return "Happeline";
        } else if (ph >= 5 && ph < 9) {
            return "Neutraalne";
        } else {
            return "Aluseline";
        }
    }
    // funkt 3
    private static double videoTootlemiseHind(double tunnidKokku) {
        return 35.99*tunnidKokku;
    }

    private static double arvutaTaksoMaksumus(double tunnid) {
        return 3+0.8*tunnid;
    }

    private static String tempHinnang(double temp) {
        if (temp < 0) {
            return "On jaas";
        } else {
            return "On vesi";
        }
    }


    private static void prindiForTsükkel(int kordadeArv) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}