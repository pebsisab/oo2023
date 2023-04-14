public class TavaToode extends Toiduaine implements Management {
    String type;
    String nimetus;

    public TavaToode(String kood, String type, String nimetus) {
        super(kood);
        this.type = type;
        this.nimetus = nimetus;
    }

    @Override
    public String getKategooria() {
        if (kood.substring(5,7).equals("TT")) {
            return "Tavatoode";
        } else {
            return "Ei ole tavatoode";
        }
    }

    @Override
    public String getTemperatuur() {
        if (kood.substring(1,3).equals("00")) {
            return "Temperatuurivahemik on 0 kuni +" + kood.substring(3,5) + " kraadi";
        } else {
            return "Temperatuurivahemik on +" + kood.substring(1,3) + " kuni +" + kood.substring(3,5) + " kraadi";
        }
    }
}
