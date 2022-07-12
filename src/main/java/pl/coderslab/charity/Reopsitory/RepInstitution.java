package pl.coderslab.charity.Reopsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.Entity.Institution;

import java.util.List;

@Repository
public interface RepInstitution extends JpaRepository<Institution, Long> {

}
