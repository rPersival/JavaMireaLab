package com.mirea.lab.second_assignment.src;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    public static List<Card> generateDeckWith52Cards() {
        String[] deckNames = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace" };

        List<Card> deck = new ArrayList<>();

        for (CardSuit suit : CardSuit.getSuits())
            for (String name : deckNames)
                deck.add(new Card(name, suit));

        return deck;
    }
}
