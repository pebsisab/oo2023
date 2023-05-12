package ee.isabella.kontrolltoo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RaamatController {

    @Autowired
    RaamatRepository raamatRepository;

    @Autowired
    NovellRepository novellRepository;

    //localhost:8080/lisa-raamat?nimetus=raamat1&maksumus=2.0&lehekylgedeArv=5
    //localhost:8080/lisa-raamat?nimetus=teine&maksumus=2&lehekylgedeArv=4
    @GetMapping ("lisa-raamat")
    public String lisaRaamat(
          @RequestParam String nimetus,
          @RequestParam double maksumus,
          @RequestParam int lehekylgedeArv
    ) {
        Raamat raamat = new Raamat();
        raamat.setNimetus(nimetus);
        raamat.setMaksumus(maksumus);
        raamat.setLehekylgedeArv(lehekylgedeArv);
        raamatRepository.save(raamat);
        //return raamatRepository.findAll();
        return "raamat lisatud";
    }

    //localhost:8080/raamatute-kogumaksumus
    @GetMapping("raamatute-kogumaksumus")
    public double koguMaksumus() {
        List<Raamat> raamatud = raamatRepository.findAll();
        double kogusumma = 0;
        for (Raamat r: raamatud) {
            kogusumma += r.getMaksumus();

        }
        return kogusumma;
    }

    @GetMapping("suurim-lk-raamat")
    public Raamat suurimLkRaamat() {
        return raamatRepository.findTopByOrderByLehekylgedeArvDesc().get(0);
    }

}
