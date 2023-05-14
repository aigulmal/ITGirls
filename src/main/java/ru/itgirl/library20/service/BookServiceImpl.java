package ru.itgirl.library20.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itgirl.library20.dto.AuthorDto;
import ru.itgirl.library20.dto.BookCreateDto;
import ru.itgirl.library20.dto.BookDto;
import ru.itgirl.library20.dto.BookUpdateDto;
import ru.itgirl.library20.model.Author;
import ru.itgirl.library20.model.Book;
import ru.itgirl.library20.model.Genre;
import ru.itgirl.library20.repository.BookRepository;
import ru.itgirl.library20.repository.GenreRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final GenreRepository genreRepository;
    @Override
    public BookDto getBookById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow();
        BookDto bookDto = convertEntityToDto(book);
        return bookDto;
    }
    @Override
    public BookDto createBook(BookCreateDto bookCreateDto) {
        Genre genre = genreRepository.findById(bookCreateDto.getGenreId()).orElseThrow();
        Book book = convertDtoToEntity(bookCreateDto);
        book.setGenre(genre);
        book = bookRepository.save(book);
        BookDto bookDto = convertEntityToDto(book);
        return bookDto;
    }
    @Override
    public BookDto updateBook(BookUpdateDto bookUpdateDto) {
        Genre genre = genreRepository.findById(bookUpdateDto.getGenreId()).orElseThrow();
        Book book = bookRepository.findById(bookUpdateDto.getId()).orElseThrow();
        book.setName(bookUpdateDto.getName());
        book.setGenre(genre);
        Book savedBook = bookRepository.save(book);
        BookDto bookDto = convertEntityToDto(savedBook);
        return bookDto;
    }
    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    private Book convertDtoToEntity(BookCreateDto bookCreateDto) {
        return Book.builder()
                .name(bookCreateDto.getName())
                .build();
    }
    private BookDto convertEntityToDto(Book book) {

        return BookDto.builder()
                .id(book.getId())
                .name(book.getName())
                .genre(book.getGenre())
                .build();
    }
}
