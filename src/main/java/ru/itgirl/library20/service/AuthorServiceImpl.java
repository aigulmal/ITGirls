package ru.itgirl.library20.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import ru.itgirl.library20.dto.AuthorCreateDto;
import ru.itgirl.library20.dto.AuthorDto;
import ru.itgirl.library20.dto.AuthorUpdateDto;
import ru.itgirl.library20.dto.BookDto;
import ru.itgirl.library20.model.Author;
import ru.itgirl.library20.repository.AuthorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public AuthorDto getAuthorById(Long id) {
        Author author = authorRepository.findById(id).orElseThrow();
        AuthorDto authorDto = convertEntityToDto(author);
        return authorDto;
    }
//    @Override
//    public AuthorDto getAuthorByName1(String name) {
//        Author author = authorRepository.findAuthorByName(name).orElseThrow();
//        return convertEnityToDto(author);
//    }
//
//    @Override
//    public AuthorDto getAuthorByName2(String name) {
//        Author author = authorRepository.findAuthorByNameBySql(name).orElseThrow();
//        return convertEnityToDto(author);
//    }
//
//    @Override
//    public AuthorDto getAuthorByName3(String name) {
//        Specification<Author> specification = Specification.where(new Specification<Author>() {
//            @Override
//            public Predicate toPredicate(Root<Author> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//                return criteriaBuilder.equal(root.get("name"), name);
//            }
//        });
//        Author author = authorRepository.findOne(specification).orElseThrow();
//        return convertEnityToDto(author);
//    }
//
//    public AuthorDto convertEnityToDto(Author author) {
//        List<BookDto> bookDtoList = null;
//        if (author.getBooks() != null){
//            bookDtoList = author.getBooks()
//                    .stream()
//                    .map(b->BookDto.builder()
//                            .id(b.getId())
//                            .name(b.getName())
//                            .genre(b.getGenre().getName())
//                            .build()
//                    ).toList();
//        }
//        return AuthorDto.builder()
//                .id(author.getId())
//                .surname(author.getSurname())
//                .name(author.getName())
//                .books(bookDtoList)
//                .build();
//    }

    @Override
    public AuthorDto createAuthor(AuthorCreateDto authorCreateDto) {
        Author author = authorRepository.save(convertDtoToEntity(authorCreateDto));
        AuthorDto authorDto = convertEntityToDto(author);
        return authorDto;
    }

    @Override
    public AuthorDto updateAuthor(AuthorUpdateDto authorUpdateDto){
        Author author = authorRepository.findById(authorUpdateDto.getId()).orElseThrow();
        author.setName(authorUpdateDto.getName());
        author.setSurname(authorUpdateDto.getSurname());
        Author savedAuthor = authorRepository.save(author);
        AuthorDto authorDto = convertEntityToDto(savedAuthor);
        return authorDto;
    }
    @Override
    public void deleteAuthor(Long id){
        authorRepository.deleteById(id);
    }

    private Author convertDtoToEntity(AuthorCreateDto authorCreateDto) {
        return Author.builder()
                .name(authorCreateDto.getName())
                .surname(authorCreateDto.getSurname())
                .build();
    }

    private AuthorDto convertEntityToDto(Author author) {
        List<BookDto> bookDtoList = null;
        if (author.getBooks() != null) {
            bookDtoList = author.getBooks()
                    .stream()
                    .map(book -> BookDto.builder()
                            .genre(book.getGenre().getName())
                            .name(book.getName())
                            .id(book.getId())
                            .build())
                    .toList();
        }

        AuthorDto authorDto = AuthorDto.builder()
                .id(author.getId())
                .name(author.getName())
                .surname(author.getSurname())
                .books(bookDtoList)
                .build();
        return authorDto;
    }

}