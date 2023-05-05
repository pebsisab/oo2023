package ee.isabella.veebipood;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RestController
public class TellimusController {

    @Autowired
    IsikRepository isikRepository;
 //   IsikController isikController; //ühel ja samal malukohal
    @Autowired
    ToodeRepository toodeRepository;
  //  ToodeController toodeController; //otseühendus selle klassiga

    @Autowired
    TellimusRepository tellimusRepository;

    List<Toode> tellimuseTooted = new ArrayList<>(Arrays.asList(
            new Toode(1, "Koola", 1.5),
            new Toode(2, "Fanta", 1.0),
            new Toode(3, "Sprite", 1.7)
    ));
    Isik tellija = new Isik(1, "Ees", "Perenimi", new Date());
    List<Tellimus> tellimused = new ArrayList<>(Arrays.asList(
            new Tellimus(1, tellija, tellimuseTooted)
            //new Tellimus(2, tellija, tellimuse2Tooted)
    ));
//
//    // GET    api.err.ee/tellimused
//    // GET    localhost:8080/tellimused
    @GetMapping("tellimused")
    public List<Tellimus> saaTellimused() {
        return tellimusRepository.findAll();
    }

    // DELETE localhost:8080/kustuta-tellimus/1
    @DeleteMapping("kustuta-tellimus/{id}")
    public String kustutaTellimus(@PathVariable int id) {
        //tellimused.remove(index);
        tellimusRepository.deleteById(id);
        return "Tellimus kustutatud!";
    }
    // POST localhost:8080/lisa-tellimus

    @PostMapping("lisa-tellimus2")
    public List<Tellimus> lisaTellimus2(
            @RequestParam int id,
            @RequestParam int tellijaId,
            @RequestParam int[] tooteIds) throws Exception {
        Isik tellija = isikRepository.findById(tellijaId).get();

        List<Toode> tellitudTooted = new ArrayList<>();
        for (Integer i: tooteIds) {
            if (i == 4) {
                throw new Exception("ID-ga 4 ei saa andmebaasi lisada!"); //ei lisa midagi andmebaasi ja tuleb s6num
            }
            Toode toode = toodeRepository.findById(i).get();
            tellitudTooted.add(toode);
        }

        //tellimused.add(new Tellimus(id, tellija, tellitudTooted));
        tellimusRepository.save(new Tellimus(id, tellija, tellitudTooted));
        return tellimusRepository.findAll();
        //POST localhost:8080/lisa-tellimus2?id=9&tellijaIndex=3&tooteIndex=1,2,3
    }

    @PostMapping("lisa-tellimus3")
    public List<Tellimus> lisaTellimus3(
            @RequestBody Tellimus tellimus) {
//        tellimused.add(tellimus);
//        return tellimused;
        tellimusRepository.save(tellimus);
        return tellimusRepository.findAll();
        //POST localhost:8080/lisa-tellimus3
        //JSON kujul
        //postman - url, header, body
    }

    @PostMapping("lisa-tellimus4") //siia peab jaama POST
    public List<Tellimus> lisaTellimus4(
            @RequestBody Tellimus tellimus) {
       // Isik isik = isikController.isikud.get(tellimus.getTellija().getId());
        Isik isik = isikRepository.findById(tellimus.getTellija().getId()).get();

        List<Toode> tellitudTooted = new ArrayList<>();
        for (Toode t: tellimus.getTooted()) {
            //Toode toode = toodeController.tooted.get(t.getId());
            Toode toode = toodeRepository.findById(t.getId()).get();
            tellitudTooted.add(toode);
        }

        //tellimused.add(new Tellimus(tellimus.getId(), isik, tellitudTooted));
        tellimusRepository.save(new Tellimus(tellimus.getId(), isik, tellitudTooted));
        return tellimusRepository.findAll();

    }
}

