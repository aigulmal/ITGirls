package ru.itgirl.libraryproject.service;

import ru.itgirl.libraryproject.dto.AuthorDto;

public interface GenreService {
    AuthorDto getGenreById(Long id);
}
