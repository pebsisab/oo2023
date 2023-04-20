package ee.isabella.kodutoo_09;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class AutoListController {
    List<Auto> autod = new ArrayList<>(Arrays.asList(
            new Auto(2, "Toyota", 5600.99, 2000),
            new Auto(3, "Mazda", 9999.99, 2002),
            new Auto(4, "Ford", 4999.99, 2003),
            new Auto(5, "Kia", 3999.99, 2002)
    ));

    @GetMapping("autod")
    public List<Auto> saaAutod() {
        return autod;
    }

    @DeleteMapping("kustuta-auto/{index}")
    public List<Auto> kustutaAuto(@PathVariable int index) {
        autod.remove(index);
        return autod;
    }

    @PatchMapping("hind-dollaritesse/{kurss}")
    public List<Auto> hindDollaritesse(@PathVariable double kurss) {
        for (Auto toode : autod) {
            double vanaHind = toode.getHind();
            double uusHind = vanaHind * kurss;
            toode.setHind(uusHind);
        }
        return autod;
    }
}
