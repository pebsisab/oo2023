package ee.isabella.kodutoo_09;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {
    Auto auto = new Auto(1,"Nissan", 2300.00, 2003);

    @GetMapping("auto") //localhost:8080/auto
    public Auto saaToode() {
        return auto;
    }

    @GetMapping("kustuta-auto")
    public Auto kustutaAuto() {
        auto = null;
        return auto;
    }

    @GetMapping("suurenda-hinda")
    public Auto suurendaHinda() {
        auto.setHind( auto.getHind()+1 );
        return auto;
    }

}
