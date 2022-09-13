package com.mirea.lab.second_assignment.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.mirea.lab.second_assignment.src.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthorTest {

    private Author author;

    @BeforeEach
    public void createAuthor() {
        author = new Author("My Name", "example.email@gmail.com", 'M');
    }

    @Test
    public void shouldReturnValidName() {
        assertEquals("My Name", author.getName());
    }

    @Test
    public void shouldReturnValidEmail() {
        assertEquals("example.email@gmail.com", author.getEmail());
    }

    @Test
    public void shouldReturnValidGender() {
        assertEquals('M', author.getGender());
    }

    @Test
    public void shouldSetAndReturnValidEmail() {
        String email = "another.email@gmail.com";
        author.setEmail(email);
        assertEquals(email, author.getEmail());
    }

    @Test
    public void shouldReturnCorrectString() {
        assertEquals("Name: My Name\nEmail: example.email@gmail.com\nGender: M", author.toString());
    }

}
