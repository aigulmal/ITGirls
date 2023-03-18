package ru.itgirl.libraryproject.service;

import ru.itgirl.libraryproject.dto.AuthorDto;
import ru.itgirl.libraryproject.dto.BookDto;
import ru.itgirl.libraryproject.dto.GenreDto;
import ru.itgirl.libraryproject.model.Author;
import ru.itgirl.libraryproject.model.Genre;

import java.util.List;

public class GenreServiceImpl implements GenreService {
    @Override
    public GenreDto getGenreById(Long id) {
        Genre author = authorRepository.findById(id).orElseThrow();
        return convertToDto(author);
    }
    private GenreDto convertToDto(Genre genre) {
        List<BookDto> bookDtoList = genre.getBooks()
                .stream()
                .map(book -> BookDto.builder()
                        .genre(book.getGenre().getName())
                        .name(book.getName())
                        .id(book.getId())
                        .build()
                ).toList();
        return AuthorDto.builder()
                .books(bookDtoList)
                .id(author.getId())
                .name(author.getName())
                .surname(author.getSurname())
                .build();
    }
}
