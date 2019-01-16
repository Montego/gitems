package montego.gitems.repo;

import montego.gitems.entity.ItemGenre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemGenreRepository extends JpaRepository<ItemGenre, Long> {
}
