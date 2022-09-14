package com.mirea.lab.third_assignment;

import com.mirea.lab.third_assignment.task_one.Circle;
import com.mirea.lab.third_assignment.task_one.TaskOne;
import com.mirea.lab.third_assignment.task_one.Tester;
import com.mirea.lab.third_assignment.task_three.TaskThree;
import com.mirea.lab.third_assignment.task_two.TaskTwo;

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
            System.out.print("Choose task set [1,2,3]: ");
            switch (scanner.nextInt()) {
                case 1:
                    TaskOne.start(scanner);
                    break;

                case 2:
                    TaskTwo.start(scanner);
                    break;

                case 3:
                    TaskThree.start(scanner);
                    break;

                default:
                    return;
            }
        }
    }
}
