package ru.itgirl.jdbcspringexample.model;

public class Book {
    private Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Book(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Book() {
    }
}
