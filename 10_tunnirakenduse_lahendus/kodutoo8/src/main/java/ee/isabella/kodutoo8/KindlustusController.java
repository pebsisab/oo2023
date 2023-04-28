package ee.isabella.kodutoo8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class KindlustusController {
    List<Kindlustus> kindlustused = new ArrayList<>(Arrays.asList(
            new Kindlustus(1, true),
            new Kindlustus(2, true),
            new Kindlustus(3, true),
            new Kindlustus(4, true)
    ));

    @GetMapping("kindlustused")
    public List<Kindlustus> saaKindlustused() {
        return kindlustused;
    }
}
