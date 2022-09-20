package com.mirea.lab.second_assignment.src;

import java.util.Scanner;

public class HowMany {
    public static void howManyWords(Scanner scanner) {
        System.out.print("Write any amount of words (use space as splitter): ");
        String words = scanner.nextLine().trim().replaceAll(" +", " ");
        int wordsCount = words.isEmpty() ? 0 : words.split(" ").length;
        System.out.println("You wrote " + wordsCount + " word" + (wordsCount == 1 ? "" : "s") + "!\n");
    }
}
