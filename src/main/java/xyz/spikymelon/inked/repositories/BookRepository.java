package xyz.spikymelon.inked.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.spikymelon.inked.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
