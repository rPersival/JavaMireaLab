package com.mirea.lab.third_assignment.task_one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Tester {
    private Circle[] circles = new Circle[0];

    public Circle getSmallestCircle() {
        return Arrays.stream(circles).min(Comparator.comparingDouble(Circle::getRadius)).orElse(null);
    }

    public Circle getLargestCircle() {
        return Arrays.stream(circles).max(Comparator.comparingDouble(Circle::getRadius)).orElse(null);
    }

    public void generateCircles(int count) {
        circles = new Circle[count];
        Random random = new Random();
        for (int i = 0; i < count; i++)
            circles[i] = new Circle(random.nextInt(50), random.nextInt(50), random.nextDouble() * 15);

    }
}
