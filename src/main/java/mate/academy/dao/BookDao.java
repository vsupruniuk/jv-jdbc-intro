package mate.academy.dao;

import java.util.List;
import java.util.Optional;
import mate.academy.models.Book;

public interface BookDao {
    Book create(Book book);

    Optional<Book> findById(Long id);

    List<Book> findAll();

    Book update(Book book);

    boolean deleteById(Long id);
}
