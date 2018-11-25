package pl.ciszek.hibernate.przyklad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManRepository extends JpaRepository<Man, Long>{
}
