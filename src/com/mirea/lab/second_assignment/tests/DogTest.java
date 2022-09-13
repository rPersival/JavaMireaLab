package com.mirea.lab.second_assignment.tests;
import com.mirea.lab.second_assignment.src.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DogTest {

    private Dog dog;

    @BeforeEach
    public void createDog() {
        dog = new Dog("Charlie", 3);
    }

    @Test
    public void shouldReturnCorrectAge() {
        assertEquals(3, dog.getDogAge());
    }

    @Test
    public void shouldReturnCorrectName() {
        assertEquals("Charlie", dog.getDogName());
    }

    @Test
    public void shouldReturnCorrectDogAge() {
        assertEquals(3 * 7, dog.getHumanAge());
    }

    @Test
    public void shouldSetAgeCorrectly() {
        int age = 11;
        dog.setDogAge(age);
        assertEquals(age, dog.getDogAge());
    }

    @Test
    public void shouldSetNameCorrectly() {
        String name = "Ace";
        dog.setDogName(name);
        assertEquals(name, dog.getDogName());
    }
}
