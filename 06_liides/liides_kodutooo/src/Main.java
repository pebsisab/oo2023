public class Main {
    public static void main(String[] args) {
        //koodi[0,1] näitab kategooriat, [2] näitab positsiooni kategooria toodetest,
        // [3] 0 = miinuskraad, 1 = pluskraad, [4-7] näitab temp vahemikku
        KylmikuToode piim = new KylmikuToode("KT110306", "jook", "Tere");
        System.out.println("Piim");
        System.out.println(piim.getKategooria());
        System.out.println(piim.getTemperatuur());
        KylmikuToode kohuke = new KylmikuToode("KT210004", "magustoit", "Kassikohuke");
        System.out.println("Kohuke");
        System.out.println(kohuke.getKategooria());
        System.out.println(kohuke.getTemperatuur());

        //koodi[0-2] näitab kategooriat, [3] näitab positsiooni kategooria toodetest,
        // [4-7] näitab temp vahemikku
        SygavkylmaToode jaatis = new SygavkylmaToode("SKT12418", "magustoit", "Limpa");
        System.out.println("Jaatis");
        System.out.println(jaatis.getKategooria());
        System.out.println(jaatis.getTemperatuur());
        SygavkylmaToode pelmeenid = new SygavkylmaToode("SKT22418", "soolane", "Pealinna pelmeenid");
        System.out.println("Pelmeenid");
        System.out.println(pelmeenid.getKategooria());
        System.out.println(pelmeenid.getTemperatuur());

        //koodi[0] näitab positsiooni kategooria toodetest, [1-4] näitab temp vahemikku, [5,6] näitab kategooriat
        TavaToode riis = new TavaToode("10024TT", "kuivaine", "Sõmer");
        System.out.println("Riis");
        System.out.println(riis.getKategooria());
        System.out.println(riis.getTemperatuur());
        TavaToode tatar = new TavaToode("20424TT", "kuivaine", "Hea tatar");
        System.out.println("Tatar");
        System.out.println(tatar.getKategooria());
        System.out.println(tatar.getTemperatuur());
    }
}