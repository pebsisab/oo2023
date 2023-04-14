public class SygavkylmaToode extends Toiduaine implements Management {
    String tyyp;
    String nimetus;

    public SygavkylmaToode(String kood, String tyyp, String nimetus) {
        super(kood);
        this.tyyp = tyyp;
        this.nimetus = nimetus;
    }

    @Override
    public String getKategooria() {
        if (kood.startsWith("SKT")) {
            return "Sygavkylmiku toode";
        } else {
            return "Ei ole Sygavkylmiku toode";
        }
    }

    @Override
    public String getTemperatuur() {
        return "Temperatuurivahemik on -" + kood.substring(4,6) + " kuni -" + kood.substring(6,8) + " kraadi";
    }
}
