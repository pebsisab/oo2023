package ee.isabella.veebipood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class IsikController {

    @Autowired
    IsikRepository isikRepository;

    List<Isik> isikud = new ArrayList<>(Arrays.asList(
            new Isik(1, "Mari", "Maasikas", new Date()),
            new Isik(2, "Mart", "Muld", new Date()),
            new Isik(3, "Juku", "Janson", new Date()),
            new Isik(4, "Mari", "Maasikas", new Date()),
            new Isik(5, "Mari", "Mustikas", new Date())
    ));

    // GET    api.err.ee/isikud
    // GET    localhost:8080/isikud
    @GetMapping("isikud")
    public List<Isik> saaIsikud() {
        return isikRepository.findAll();
    }

    // DELETE localhost:8080/kustuta-isik/1
    @GetMapping("kustuta-isik/{id}")
    public String kustutaIsik(@PathVariable int id) {
        //isikud.remove(index);
        isikRepository.deleteById(id);
        return "Isik kustutatud!";
    }
    // POST localhost:8080/lisa-isik?id=1&eesnimi=Ees&perenimi=Pere
    @GetMapping("lisa-isik")
    public List<Isik> lisaIsik(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi) {
        //isikud.add(new Isik(id, eesnimi, perenimi, new Date()));
        //return isikud;
        isikRepository.save(new Isik(id, eesnimi, perenimi, new Date()));
        return isikRepository.findAll();
    }
}