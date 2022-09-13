package com.mirea.lab.second_assignment.tests;

import com.mirea.lab.second_assignment.src.Dog;
import com.mirea.lab.second_assignment.src.DogNursery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogNurseryTest {

    private DogNursery dogNursery;

    @BeforeEach
    void setUp() {
        dogNursery = new DogNursery();
    }

    @Test
    void shouldCorrectlyAddDogs() {
        assertEquals(0, dogNursery.getDogs().size());
        dogNursery.addDog(generateDog());
        assertEquals(1, dogNursery.getDogs().size());
    }

    @Test
    void shouldCorrectlyRemoveDogs() {
        Dog dog = generateDog();
        dogNursery.addDog(dog);
        assertEquals(1, dogNursery.getDogs().size());
        dogNursery.removeDog(dog);
        assertEquals(0, dogNursery.getDogs().size());
    }

    @Test
    void shouldReturnCorrectString() {
        Dog dog1 = new Dog("Cooper", 7);
        Dog dog2 = new Dog("Ace", 11);
        dogNursery.addDog(dog1);
        dogNursery.addDog(dog2);
        assertEquals(2, dogNursery.getDogs().size());
        String dogs = dogNursery.toString();
        assertEquals("[Name: Cooper | Age: 7, Name: Ace | Age: 11]", dogs);
    }

    private Dog generateDog() {
        return new Dog("Charlie", 3);
    }
}