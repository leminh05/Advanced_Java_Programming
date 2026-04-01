package com.dev.spring.example;

public class Book {
    private Integer id;
    private String name;

    public Book() {
        super();
        System.out.println("Book object is being created!");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book [Id=" + id + ", name=" + name + "]";
    }
}
