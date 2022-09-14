package com.mirea.lab.second_assignment.src;

import java.util.List;

public enum CardSuit {
    DIAMONDS("♦"),
    CLUBS("♣"),
    HEARTS("♥"),
    SPADES("♠");

    private final String suit;
    public static final List<CardSuit> SUITS = List.of(values());

    CardSuit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return this.suit;
    }
}
