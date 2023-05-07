package ru.itgirl.library20.service;

import ru.itgirl.library20.dto.AuthorDto;
import ru.itgirl.library20.dto.BookCreateDto;
import ru.itgirl.library20.dto.BookDto;
import ru.itgirl.library20.dto.BookUpdateDto;

public interface BookService {

    BookDto getBookById(Long id);
    BookDto createBook(BookCreateDto bookCreateDto);
    BookDto updateBook(BookUpdateDto bookUpdateDto);
    void deleteBook(Long id);
}
