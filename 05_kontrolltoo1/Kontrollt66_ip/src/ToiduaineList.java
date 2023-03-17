import java.util.ArrayList;
import java.util.List;

public class ToiduaineList {
    List<Toiduaine> toiduained = new ArrayList<Toiduaine>();

    public void lisaToiduaine(String nimetus, double valkudeProtsent, double rasvadeProtsent, double sysivesikuteProtsent){
        Toiduaine toiduaine = new Toiduaine(nimetus, valkudeProtsent, rasvadeProtsent, sysivesikuteProtsent);
        toiduained.add(toiduaine);
    }
}
