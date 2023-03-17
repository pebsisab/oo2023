import java.util.ArrayList;
import java.util.List;

public class ToiduaineList {
    List<Toiduaine> toiduained = new ArrayList<Toiduaine>();

    //listi lisamine
    public void lisaToiduaine(String nimetus, double valkudeProtsent, double rasvadeProtsent, double sysivesikuteProtsent){
        Toiduaine toiduaine = new Toiduaine(nimetus, valkudeProtsent, rasvadeProtsent, sysivesikuteProtsent);
        toiduained.add(toiduaine);
    }

    //listist kustutamine
    public void kustutaToiduaine(String toiduaineListis){
        for (int i = 0; i < toiduained.size(); i++) {
            if(toiduained.get(i).nimetus.equals(toiduaineListis)){
                toiduained.remove(i);
                System.out.println("Toidaine kustutati");
                break;
            }
        }
    }

    //nime jargi andmete vaatamine
    public void vaataAndmeid(String toiduaineListis){
        for (int i = 0; i < toiduained.size(); i++) {
            if(toiduained.get(i).nimetus.equals(toiduaineListis)){
                System.out.println(toiduained.get(i).nimetus);
                System.out.println(toiduained.get(i).rasvadeProtsent);
                System.out.println(toiduained.get(i).valkudeProtsent);
                System.out.println(toiduained.get(i).sysivesikuteProtsent);
            }
        }
    }

    //rasvaprotsendivahemiku jargi otsimine
    public List<Toiduaine> rasvaJargiOtsimine(double rasvMin, double rasvMax){
        List<Toiduaine> leitud = new ArrayList<>();
        for (int i = 0; i < toiduained.size(); i++) {
            if(toiduained.get(i).rasvadeProtsent >= rasvMin && toiduained.get(i).rasvadeProtsent <= rasvMax){
                leitud.add(toiduained.get(i));
            }
        }
        return leitud;
    }
}
