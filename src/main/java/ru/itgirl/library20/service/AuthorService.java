package ru.itgirl.library20.service;

import ru.itgirl.library20.dto.AuthorCreateDto;
import ru.itgirl.library20.dto.AuthorDto;
import ru.itgirl.library20.dto.AuthorUpdateDto;

public interface AuthorService {
    AuthorDto getAuthorById(Long id);

//    AuthorDto getAuthorByName1(String name);
//
//    AuthorDto getAuthorByName2(String name);
//
//    AuthorDto getAuthorByName3(String name);

    AuthorDto createAuthor(AuthorCreateDto authorCreateDto);
    AuthorDto updateAuthor(AuthorUpdateDto authorUpdateDto);
    void deleteAuthor(Long id);

}
