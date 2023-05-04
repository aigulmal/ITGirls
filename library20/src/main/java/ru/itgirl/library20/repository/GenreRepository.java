package ru.itgirl.library20.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itgirl.library20.model.Genre;

public interface GenreRepository  extends JpaRepository<Genre, Long> {
}
