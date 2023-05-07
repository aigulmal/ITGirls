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
        Book book = bookRepository.findById(bookUpdateDto.getId()).orElseThrow();
        book.setName(bookUpdateDto.getName());
        book.setGenre(bookUpdateDto.getGenre());
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
                .genre(bookCreateDto.getGenreId())
                .build();
    }

    private BookDto convertEntityToDto(Book book) {
//        List<AuthorDto> authorDtoList = null;
//        if (book.getAuthors() != null) {
//           authorDtoList = book.getAuthors()
//                   .stream()
//                   .map(author -> AuthorDto.builder()
//                           .id(author.getId())
//                           .surname(author.getSurname())
//                           .name(author.getName())
//                           .build())
//                   .toList();
//        }
        return BookDto.builder()
                .id(book.getId())
                .name(book.getName())
                .genre(book.getGenre().getName())
//                .authors(book.getAuthors()
//                        .stream()
//                        .peek(author -> AuthorDto.builder()
//                                .name(author.getName())
//                                .surname(author.getName()))
//                        .collect(Collectors.toList()))
                .build();
//    @Override
//    public BookDto getByNameV1(String name) {
//        Book book = bookRepository.findBookByName(name).orElseThrow();
//        return convertEntityToDto(book);
//    }
//    private BookDto convertEntityToDto(Book book) {
//        return BookDto.builder()
//                .id(book.getId())
//                //.genre(book.getGenre().getName())
//                .name(book.getName())
//                .build();
//    }

    }
}
