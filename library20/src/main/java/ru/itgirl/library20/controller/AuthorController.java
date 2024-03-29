package ru.itgirl.library20.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.itgirl.library20.dto.AuthorCreateDto;
import ru.itgirl.library20.dto.AuthorDto;
import ru.itgirl.library20.dto.AuthorUpdateDto;
import ru.itgirl.library20.service.AuthorService;

@RestController
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    //    @GetMapping("/author")
//    AuthorDto getAuthorByName1(@RequestParam("name") String name) {
//        return authorService.getAuthorByName1(name);
//    }
//    @GetMapping("/author/v2")
//    AuthorDto getAuthorByNameV2(@RequestParam("name") String name) {
//        return authorService.getAuthorByName2(name);
//    }
//    @GetMapping("/author/v3")
//    AuthorDto getAuthorByNameV3(@RequestParam("name") String name) {
//        return authorService.getAuthorByName3(name);
//    }
    @PostMapping("/author/{id}")
    AuthorDto getAuthorById(@PathVariable("id") Long id) {
        return authorService.getAuthorById(id);
    }
    @PostMapping("/author/create")
    AuthorDto createAuthor (@RequestBody AuthorCreateDto authorCreateDto) {
        return authorService.createAuthor(authorCreateDto);
    }
    @PutMapping("/author/update")
    AuthorDto updateAuthor(@RequestBody AuthorUpdateDto authorUpdateDto) {
        return authorService.updateAuthor(authorUpdateDto);
    }
    @DeleteMapping("/author/delete/{id}")
    void deleteAuthor(@PathVariable("id") Long id) {
        authorService.deleteAuthor(id);
    }
}