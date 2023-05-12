package ee.isabella.kontrolltoo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NovellController {

    @Autowired
    NovellRepository novellRepository;

    //localhost:8080/lisa-kirje?pealkiri=test&sisu=testtesttest
    @GetMapping("lisa-kirje")
    public List<Novell> lisaKirje(
            @RequestParam Long id,
            @RequestParam String pealkiri,
            @RequestParam String sisu
    ) throws Exception {
        if (sisu.length() < 10) {
            throw new Exception("Sisu ei saa olla lyhem kui 10 tähte");
        }
        novellRepository.save(new Novell(id, pealkiri, sisu));
        return novellRepository.findAll();
    }

//    @GetMapping("tahtede-arv")
//    public int saaArv(
//            @RequestParam Long id
//    ) {
//        Novell novell = novellRepository.findById(id).get();
//    }
}
