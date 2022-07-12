package pl.coderslab.charity.Reopsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.Entity.Category;

@Repository
public interface RepCategory extends JpaRepository<Category, Long> {
}
