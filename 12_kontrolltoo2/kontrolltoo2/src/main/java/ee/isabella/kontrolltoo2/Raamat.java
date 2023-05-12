package ee.isabella.kontrolltoo2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Raamat {
    @Id
    private String nimetus;
    private double maksumus;
    private int lehekylgedeArv;
    @OneToMany
    private List<Novell> novellideKogum;

}
