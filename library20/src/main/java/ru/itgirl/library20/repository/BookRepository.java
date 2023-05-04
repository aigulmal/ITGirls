package ru.itgirl.library20.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itgirl.library20.model.Book;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findBookByName(String name);
}
