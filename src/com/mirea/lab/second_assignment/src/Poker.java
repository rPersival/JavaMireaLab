package com.mirea.lab.second_assignment.src;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Poker {
    private final List<Card> deck;

    public Poker() {
        this.deck = Deck.generateDeckWith52Cards();
    }

    public void newGame(int numberOfPeople) {
        if (numberOfPeople > 6) {
            System.out.println("Too many people!");
            return;
        } else if (numberOfPeople < 1) {
            System.out.println("Please enter valid number of people");
            return;
        }

        LinkedList<Card> currentDeck = new LinkedList<>(deck);
        Collections.shuffle(currentDeck);

        System.out.println("Dealer");
        poll(5, currentDeck);
        System.out.print("\n");

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Player #" + (i + 1));
            poll(5, currentDeck);
            System.out.print("\n");
        }
    }

    private void poll(int count, LinkedList<Card> currentDeck) {
        if (count < 1 || count > currentDeck.size() - 1) return;

        for (int i = 0; i < count; i++)
            System.out.println(currentDeck.poll());
    }
}
