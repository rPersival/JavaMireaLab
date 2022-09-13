package com.mirea.lab.first_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Choose task [1,2,3,4,5]: ");
            switch (scanner.nextInt()) {
                case 1:
                    taskOne();
                    break;

                case 2:
                    taskTwo();
                    break;

                case 3:
                    taskThree(args);
                    break;

                case 4:
                    taskFour();
                    break;

                case 5:
                    taskFive();
                    break;

                default:
                    return;
            }
        }
    }

    public static void taskOne() {
        int[] nums = { 1, 2, 3 };
        int sum = Arrays.stream(nums).sum();
        System.out.println(sum);
        System.out.println((double) sum / nums.length);
    }

    public static void taskTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array Length: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        if (n == 0) return;
        System.out.print("Array Elements (use space as separator): ");
        for (int i = 0; i < nums.length; i++) nums[i] = scanner.nextInt();
        int sum = Arrays.stream(nums).sum();
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + Arrays.stream(nums).min().getAsInt());
        System.out.println("Min: " + Arrays.stream(nums).max().getAsInt());
    }

    public static void taskThree(String[] args) {
        if (args.length == 0) {
            System.out.println("No program arguments found. Navigate to Run/Debug configuration" +
                    " and set arguments in the field \"Program arguments\"");
            return;
        }
        Arrays.stream(args).forEach(System.out::println);
    }

    public static void taskFour() {
        System.out.println("Harmonic series: ");
        double[] harmonicSeries = new double[10];
        for (int i = 1; i < harmonicSeries.length; i++)
            harmonicSeries[i - 1] = (double) 1 / i;
        Arrays.stream(harmonicSeries).forEach(x -> System.out.printf("%.2f ", x));
        System.out.print("\n");
    }

    public static void taskFive() {
        try {
            assertEquals(1, getFactorialOfN(1));
            assertEquals(2, getFactorialOfN(2));
            assertEquals(6, getFactorialOfN(3));
            assertEquals(720, getFactorialOfN(6));
        } catch (Exception ignored) {
            return;
        }
        System.out.println("All tests have passed!");
    }

    public static int getFactorialOfN(int n) {
        int out = 1;
        for (int i = 1; i < n + 1; i++)
            out *= i;
        return out;
    }

    public static <T> void assertEquals(T expected, T actual) throws Exception {
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + expected);
        if (expected.equals(actual))
            System.out.println("Test passed");
        else {
            System.out.println("Test not passed");
            throw new Exception("Test not passed:\n Expected " + expected + "\n Actual: " + actual);
        }
    }
}