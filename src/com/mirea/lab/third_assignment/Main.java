package com.mirea.lab.third_assignment;

import com.mirea.lab.Selector;
import com.mirea.lab.third_assignment.task_one.TaskOne;
import com.mirea.lab.third_assignment.task_three.TaskThree;
import com.mirea.lab.third_assignment.task_two.TaskTwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String info = "Math/Random tasks - 1\nWrapper tasks - 2\nFormat print tasks - 3";

        Selector.selectTaskScanner(scanner, info, TaskOne::start, TaskTwo::start, TaskThree::start);

    }
}
