package com.mirea.lab.third_assignment.task_two;

import java.util.Scanner;

public class TaskTwo {

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
                    taskFour();
                    break;

                default:
                    return;
            }
        }
    }

    public static void taskOne() {
        Double num = Double.valueOf(1.2323);
        System.out.println(num);
    }

    public static void taskTwo() {
        Double num = Double.parseDouble("1.2323");
        System.out.println(num);
    }

    public static void taskThree() {
        Double num = 1.2323;
        int intNum = num.intValue();
        byte byteNum = num.byteValue();
        short shortNum = num.shortValue();
        long longNum = num.longValue();
        float floatNum = num.floatValue();
        double doubleNum = num.doubleValue();
        boolean boolNum = num > 0;
        char character = num.toString().charAt(0);
        System.out.println(intNum);
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(boolNum);
        System.out.println(character);
    }

    public static void taskFour() {
        String str = Double.toString(1.2323);
        System.out.println(str);
    }
}
