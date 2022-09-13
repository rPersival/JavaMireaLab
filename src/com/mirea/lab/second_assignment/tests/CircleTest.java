package com.mirea.lab.second_assignment.tests;

import com.mirea.lab.second_assignment.src.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle circle;
    private double x;
    private double y;
    private double radius;

    @BeforeEach
    void createCircle() {
        this.x = generate();
        this.y = generate();
        this.radius = (int) Math.round(generate());
        circle = new Circle(new Point(x, y), radius);
    }

    @Test
    void shouldGetCorrectPoint() {
        assertEquals(new Point(x, y), circle.getPoint());
    }

    @Test
    void shouldReturnCorrectRadius() {
        assertEquals(radius, circle.getRadius());
    }

    @Test
    void shouldSetCorrectRadius() {
        int testRadius = (int) Math.round(generate());
        circle.setRadius(testRadius);
        assertEquals(testRadius, circle.getRadius());
    }

    @Test
    void shouldReturnCorrectArea() {
        int testRadius = (int) Math.round(generate());
        circle.setRadius(testRadius);
        assertEquals(Math.pow(testRadius, 2) * Math.PI, circle.getArea());
    }

    @Test
    void shouldReturnCorrectCircumference() {
        int testRadius = (int) Math.round(generate());
        circle.setRadius(testRadius);
        assertEquals(2 * testRadius * Math.PI, circle.getCircumference());
    }

    double generate() {
        return Math.random() * 100;
    }
}