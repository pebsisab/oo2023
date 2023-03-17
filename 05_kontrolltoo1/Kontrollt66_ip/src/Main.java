import java.util.List;

public class Main {
    public static void main(String[] args) {
        //yl - Salat
        Toiduaine kartul = new Toiduaine("Kartul", 10, 20, 70);
        Toiduaine hapukoor = new Toiduaine("Hapukoor", 20, 50, 30);
        Toiduaine vorst = new Toiduaine("Vorst", 40, 40, 20);

        Toidukomponent nr1 = new Toidukomponent(hapukoor, 50);
        Toidukomponent nr2 = new Toidukomponent(kartul, 45);
        Toidukomponent nr3 = new Toidukomponent(vorst, 60);

        ToiduaineList list1 = new ToiduaineList();

        //rasvaprotsentide arvutamine
        double arvutus1 = (nr1.kogusGrammides * nr1.toiduaine.rasvadeProtsent)/100;
        double arvutus2 = (nr2.kogusGrammides * nr2.toiduaine.rasvadeProtsent)/100;
        double arvutus3 = (nr3.kogusGrammides * nr3.toiduaine.rasvadeProtsent)/100;

        System.out.println("Toidukomponendis nr1 on "+ arvutus1 + "g rasva");
        System.out.println("Toidukomponendis nr2 on "+ arvutus2 + "g rasva");
        System.out.println("Toidukomponendis nr3 on "+ arvutus3 + "g rasva");

        list1.lisaToiduaine("Porgand", 4, 10, 86);
        list1.lisaToiduaine("Kaalikas", 5, 10, 85);
        list1.vaataAndmeid("Porgand");
        list1.kustutaToiduaine("Kaalikas");

        List<Toiduaine> leitud = list1.rasvaJargiOtsimine(2,10);
        for (int i = 0; i < leitud.size(); i++) {
            System.out.println("Toiduaine, mis on antud vahemikus: " + leitud.get(i).nimetus);
        }
    }

}