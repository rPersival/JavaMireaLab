package com.mirea.lab.third_assignment.task_two;

import com.mirea.lab.Selector;

import java.util.Scanner;

public class TaskTwo {

    public static void start(Scanner scanner) {
        Selector.selectTask(scanner, "Wrapper tasks (0 to exit)", TaskTwo::taskOne, TaskTwo::taskTwo,
                TaskTwo::taskThree, TaskTwo::taskFour);
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
