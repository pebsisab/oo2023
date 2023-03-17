public class Toiduaine {
    String nimetus;
    double valkudeProtsent;
    double rasvadeProtsent;
    double sysivesikuteProtsent;

    public Toiduaine(String nimetus, double valkudeProtsent, double rasvadeProtsent, double sysivesikuteProtsent){
        this.nimetus = nimetus;
        this.valkudeProtsent = valkudeProtsent;
        this.rasvadeProtsent = rasvadeProtsent;
        this.sysivesikuteProtsent = sysivesikuteProtsent;
        System.out.println(kogusteKontroll());
    }

    public String kogusteKontroll(){
        if(this.valkudeProtsent + this.rasvadeProtsent + this.sysivesikuteProtsent >100){
            return "Toiduaine protsent kokku ei tohi yletada 100%";
        } else {
            return "Toiduaine loomisel ei esinenud probleeme";
        }
    }

}
