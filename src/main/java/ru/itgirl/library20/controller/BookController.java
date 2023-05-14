package ru.itgirl.library20.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.itgirl.library20.dto.*;
import ru.itgirl.library20.service.BookService;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    @PostMapping("/book/{id}")
    BookDto getBookById(@PathVariable("id") Long id) {
        return bookService.getBookById(id);
    }
    @PostMapping("/book/create")
    BookDto createBook (@RequestBody BookCreateDto bookCreateDto) {
        return bookService.createBook(bookCreateDto);
    }
    @PutMapping("/book/update/{id}")
    BookDto updateBook(@RequestBody BookUpdateDto bookUpdateDto) {
        return bookService.updateBook(bookUpdateDto);
    }
    @DeleteMapping("/book/delete/{id}")
    void deleteBook(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}