package com.mirea.lab.third_assignment;

import com.mirea.lab.third_assignment.task_one.Circle;
import com.mirea.lab.third_assignment.task_one.TaskOne;
import com.mirea.lab.third_assignment.task_one.Tester;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Math/Random tasks - 1");
            System.out.println("Wrapper tasks - 2");
            System.out.println("Format print tasks - 3");
            System.out.println("Choose task set [1,2,3]: ");
            switch (scanner.nextInt()) {
                case 1:
                    TaskOne.start(scanner);
                    break;

                case 2:
                    break;

                case 3:
                    break;

                default:
                    return;
            }
        }
    }
}
