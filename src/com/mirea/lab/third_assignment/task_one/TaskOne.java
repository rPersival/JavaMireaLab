package com.mirea.lab.third_assignment.task_one;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskOne {

    public static void start(Scanner scanner) {
        while (true) {
            System.out.print("Choose task [1,2,3,4]: ");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    taskOne();
                    break;

                case 2:
                    taskTwo();
                    break;

                case 3:
                    taskThree();
                    break;

                case 4:
                    taskFour(scanner);
                    break;

                default:
                    return;
            }
        }
    }

    public static void taskOne() {
        Double[] array = new Double[5];
        System.out.println("Using Math.random()");
        for (int i = 0; i < array.length; i++)
            array[i] = Math.random();

        printArray(array);

        System.out.println("Using Random class");
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextDouble();

        printArray(array);
    }

    private static void taskTwo() {
        Tester tester = new Tester();
        tester.generateCircles(15);
        Circle circle = tester.getSmallestCircle();
        System.out.println(circle);
        circle = tester.getLargestCircle();
        System.out.println(circle);
    }

    public static void taskThree() {
        Random random = new Random();
        Integer[] array = new Integer[4];
        for (int i = 0; i < array.length; i++)
            array[i] = 10 + random.nextInt(100);
        printArray(array);

        for (int i = 1; i < array.length; i++)
            if (array[i - 1] >= array[i]) {
                System.out.println("Array is not an increasing sequence");
                return;
            }
        System.out.println("Array is an increasing sequence");
    }

    public static void taskFour(Scanner scanner) {
        int n = -1;
        while (n < 1) {
            System.out.print("N: ");
            n = scanner.nextInt();
        }
        Integer[] array = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(n + 1);
        printArray(array);

        Integer[] secondArray = Arrays.stream(array).filter(x -> x % 2 == 0).toArray(Integer[]::new);
        printArray(secondArray);
    }

    private static <T> void printArray(T[] array) {
        Arrays.stream(array).forEach(x -> System.out.print(x + " "));
        System.out.print("\n");
    }
}
