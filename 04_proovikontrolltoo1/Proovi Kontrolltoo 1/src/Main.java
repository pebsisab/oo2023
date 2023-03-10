import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //funktsioon kolme arvu aritmeetilise keskmise leidmiseks
        // private - funktsiooni saab kasutada vaid selle klassi sees (public puhul saab teistes ka)
        System.out.println(arvutaKeskmine(4,6,7));

        double[] sisend = {3,4,5,6};
        System.out.println(Arrays.toString(libisevKeskmine(sisend)));

        LibisevKeskmine libisev = new LibisevKeskmine(2,3,4);
        libisev.lisaArv(4);
        System.out.println(libisev.arvudKeskmisega);

    }
    private static double arvutaKeskmine(double arv1, double arv2, double arv3) {
        return (arv1 + arv2 + arv3) / 3;
    }
    
    //libisev keskmine
    private static double[] libisevKeskmine(double[] arvud) {
        double[] valjund = new double[arvud.length - 2];
        for (int i = 0; i < arvud.length-2; i++) {
            valjund[i] = (arvud[i] + arvud[i +1] + arvud[i+2]) / 3.0;
        }
        return valjund;
    }
    
    //List numbriList = new ArrayList(); - manipuleeritav (1 juurde, 1 vahemaks jne)
    //numbriList[] -read only
    // List<Double> sisend = new ArrayList(Arrays.asList(3,4,5,6));
}