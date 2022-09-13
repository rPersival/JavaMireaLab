package com.mirea.lab.second_assignment.src;

public class Card {
    private String name;
    private CardSuit suit;

    public Card(String name, CardSuit suit) {
        this.name = name;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return name + " " + suit.getSuit();
    }
}
