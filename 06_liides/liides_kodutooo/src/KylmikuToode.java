public class KylmikuToode extends Toiduaine implements Management {
    String tyyp;
    String nimetus;

    public KylmikuToode(String kood, String tyyp, String nimetus) {
        super(kood);
        this.tyyp = tyyp;
        this.nimetus = nimetus;
    }


    @Override
    public String getKategooria() {
        if (kood.startsWith("KT")) {
            return "Külmikutoode";
        } else {
            return "Ei ole külmikutoode";
        }
    }

    @Override
    public String getTemperatuur() {
        if (kood.charAt(3) == '0') {
            return "Temperatuurivahemik on -" + kood.substring(4,6) + " kuni -" + kood.substring(6,8) + " kraadi";
        } else if(kood.charAt(3) == '1') {
            if (kood.substring(4,6).equals("00")) {
                return "Temperatuurivahemik on 0 kuni +" + kood.substring(6,8) + " kraadi";
            } else {
                return "Temperatuurivahemik on +" + kood.substring(4,6) + " kuni +" + kood.substring(6,8) + " kraadi";
            }
        } else {
            return "vigane kood";
        }
    }
}
