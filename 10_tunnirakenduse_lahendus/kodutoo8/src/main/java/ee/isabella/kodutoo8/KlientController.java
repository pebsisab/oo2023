package ee.isabella.kodutoo8;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class KlientController {

    List<Klient> kliendid = new ArrayList<>(Arrays.asList(
            new Klient(1, "Maali", "Maasikas"),
            new Klient(2, "Mari", "Mustikas"),
            new Klient(3, "Mart", "Muld"),
            new Klient(4, "Marti", "Martinson")
    ));

    @GetMapping("kliendid")
    public List<Klient> saaKliendid() {
        return kliendid;
    }

    @DeleteMapping("kustuta-klient/{index}")
    public String kustutaIsik(@PathVariable int index) {
        kliendid.remove(index);
        return "Klient sai kustutatud!";
    }

    @PostMapping("lisa-klient")
    public List<Klient> lisaKlient(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi) {
        kliendid.add(new Klient(id, eesnimi, perenimi));
        return kliendid;
    }

}

