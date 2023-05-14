package ru.itgirl.library20.service;

import ru.itgirl.library20.dto.AuthorCreateDto;
import ru.itgirl.library20.dto.AuthorDto;
import ru.itgirl.library20.dto.AuthorUpdateDto;

public interface AuthorService {
    AuthorDto getAuthorById(Long id);
    AuthorDto createAuthor(AuthorCreateDto authorCreateDto);
    AuthorDto updateAuthor(AuthorUpdateDto authorUpdateDto);
    void deleteAuthor(Long id);

}
