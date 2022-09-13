package com.mirea.lab.second_assignment.src;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("To run tests select package com.mirea.lab.second_assignment.tests, " +
                "click right mouse button and select \"Run 'Tests in com.mirea.lab.second_assignment.tests'\" " +
                "or simply click Ctrl+Shift+F10 in the tests package\n");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Reverse Array - 1");
            System.out.println("Play Poker - 2");
            System.out.println("Type Words - 3");
            System.out.print("Choose Task [1, 2, 3]: ");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    reverseArray(scanner);
                    break;

                case 2:
                    playPoker(scanner);
                    break;

                case 3:
                    HowMany.howManyWords(scanner);
                    break;

                default:
                    return;
            }
        }
    }

    public static void reverseArray(Scanner scanner) {
        System.out.print("Array Length: ");
        int n = scanner.nextInt();
        Integer[] nums = new Integer[n];
        if (n == 0) return;
        System.out.print("Array Elements (use space as separator): ");
        for (int i = 0; i < nums.length; i++) nums[i] = scanner.nextInt();

        ArrayReverser.reverse(nums);
        System.out.print("\nReversed Array: ");
        Arrays.stream(nums).forEach(x -> System.out.print(x + " "));
        System.out.print("\n\n");
    }

    public static void playPoker(Scanner scanner) {
        System.out.print("Number of people: ");
        int n = scanner.nextInt();

        new Poker().newGame(n);
    }
}
