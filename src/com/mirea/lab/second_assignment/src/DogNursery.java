package com.mirea.lab.second_assignment.src;

import java.util.ArrayList;
import java.util.List;

public class DogNursery {
    private final List<Dog> dogs;

    public DogNursery() {
        this.dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        this.dogs.add(dog);
    }

    public void removeDog(Dog dog) {
        this.dogs.remove(dog);
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    @Override
    public String toString() {
        return dogs.toString();
    }
}
