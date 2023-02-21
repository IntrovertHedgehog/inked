package xyz.spikymelon.inked.bootstrap;

import org.hibernate.annotations.Comment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import xyz.spikymelon.inked.domain.Author;
import xyz.spikymelon.inked.domain.Book;
import xyz.spikymelon.inked.repositories.AuthorRepository;
import xyz.spikymelon.inked.repositories.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Author tm = new Author("Tony", "Myers");
        Book sz = new Book("Slavoj Zizek", "12312312412");
        tm.getBooks().add(sz);
        sz.getAuthors().add(tm);

        authorRepository.save(tm);
        bookRepository.save(sz);

        Author am = new Author("Adam", "Smith");
        Book wn = new Book("Wealth of Nations", "2384324");
        am.getBooks().add(wn);
        wn.getAuthors().add(am);

        authorRepository.save(am);
        bookRepository.save(wn);

        System.out.printf("Number of Books: %d", bookRepository.count());
        System.out.println();
        System.out.printf("Number of Authors: %d", authorRepository.count());
    }
}
