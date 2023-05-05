package ee.isabella.veebipood;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Toode {
    @Id // primaarvotmega
    private int id; //standard on panna andmebaasi ID Long, mitte int
    private String nimi;
    private double hind;

}
