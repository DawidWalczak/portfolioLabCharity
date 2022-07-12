package pl.coderslab.charity.Reopsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.Entity.Donation;

import java.util.List;

@Repository
public interface RepDonation extends JpaRepository<Donation, Long> {

    @Query(value = "SELECT SUM(quantity) FROM donation", nativeQuery = true)
    Integer findAllBags();

}

