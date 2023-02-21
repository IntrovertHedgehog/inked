package xyz.spikymelon.inked.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.spikymelon.inked.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
