package com.mirea.lab.second_assignment.src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bookshelf {
    private final List<Book> books;

    public Bookshelf() {
        this.books = new ArrayList<>();
    }

    public void sortBooks() {
        books.sort(Comparator.comparing(Book::getReleaseYear));
    }

    public Book getOldestBook() {
        return books.stream().min(Comparator.comparing(Book::getReleaseYear)).orElse(null);
    }

    public Book getNewestBook() {
        return books.stream().max(Comparator.comparing(Book::getReleaseYear)).orElse(null);
    }

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
