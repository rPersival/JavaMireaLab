package com.mirea.lab.second_assignment.src;

public class Book {
    private String author;
    private String name;
    private int releaseYear;

    public Book(String author, String name, int releaseYear) {
        this.author = author;
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
