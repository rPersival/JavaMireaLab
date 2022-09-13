package com.mirea.lab.second_assignment.tests;

import com.mirea.lab.second_assignment.src.Book;
import com.mirea.lab.second_assignment.src.Bookshelf;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookshelfTest {

    private Bookshelf bookshelf;

    @BeforeEach
    void createBookshelf() {
        bookshelf = new Bookshelf();
        addBooks();
    }

    @Test
    void shouldCorrectlyAddBooks() {
        assertEquals(8, bookshelf.getBooks().size());
        bookshelf.add(new Book("Arthur Charles Clarke | Stephen Baxter",
                "The Light of Other Days", 2000));
        assertEquals(9, bookshelf.getBooks().size());
    }

    @Test
    void shouldCorrectlyRemoveBooks() {
        Book book = new Book("Arthur Charles Clarke | Stephen Baxter",
                "The Light of Other Days", 2000);
        bookshelf.add(book);
        assertEquals(9, bookshelf.getBooks().size());
        bookshelf.remove(book);
        assertEquals(8, bookshelf.getBooks().size());
    }

    @Test
    void shouldCorrectlySortBooks() {
        bookshelf.sortBooks();
        List<Book> books = bookshelf.getBooks();
        assertEquals(1867, books.get(0).getReleaseYear());
        assertEquals(2008, books.get(books.size() - 1).getReleaseYear());
    }

    @Test
    void shouldReturnNewestBook() {
        assertEquals(2008, bookshelf.getNewestBook().getReleaseYear());
    }

    @Test
    void shouldReturnOldestBook() {
        assertEquals(1867, bookshelf.getOldestBook().getReleaseYear());
    }

    private void addBooks() {
        Book[] books = {
                new Book("George Orwell", "1984", 1949),
                new Book("Ray Bradbury", "Fahrenheit 451", 1953),
                new Book("Isaac Asimov", "I, Robot", 1950),
                new Book("Agatha Christie", "Murder in the Orient Express", 1934),
                new Book("Suzanne Collins", "The Hunger Games", 2008),
                new Book("John Ronald Reuel Tolkien", "The Lord of the Rings", 1954),
                new Book("Jules Verne", "Journey to the center of the Earth", 1867),
                new Book("Douglas Adams", "The Hitchhiker's Guide to the Galaxy", 1979)
        };

        if (bookshelf != null)
            for (Book book : books)
                bookshelf.add(book);
    }
}