package ru.itgirl.library20.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itgirl.library20.model.Author;
import ru.itgirl.library20.model.Genre;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BookCreateDto {
    private String name;
    private Genre genre;
    private Set<Author> authors;
}