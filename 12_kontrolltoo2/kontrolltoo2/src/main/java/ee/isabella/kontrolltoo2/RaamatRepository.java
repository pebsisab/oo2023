package ee.isabella.kontrolltoo2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RaamatRepository extends JpaRepository<Raamat,String> {

    List<Raamat> findTopByOrderByLehekylgedeArvDesc();


}
