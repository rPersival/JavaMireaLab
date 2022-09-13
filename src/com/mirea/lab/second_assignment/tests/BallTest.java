package com.mirea.lab.second_assignment.tests;

import com.mirea.lab.second_assignment.src.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    private Ball ball;

    @BeforeEach
    public void createBall() {
        ball = new Ball();
    }

    @Test
    void xShouldEquals0WhenCreated() {
        assertEquals(0.0d, ball.getX());
    }

    @Test
    void yShouldEquals0WhenCreated() {
        assertEquals(0.0d, ball.getY());
    }

    @Test
    void shouldSetValidX() {
        double x = 19.0d;
        ball.setX(x);
        assertEquals(x, ball.getX());
    }

    @Test
    void shouldSetValidY() {
        double y = 15.0d;
        ball.setY(y);
        assertEquals(y, ball.getY());
    }

    @Test
    void shouldSetValidXY() {
        double x = 12.0d;
        double y = 10.0d;
        ball.setXY(x, y);
        assertEquals(x, ball.getX());
        assertEquals(y, ball.getY());
    }

    @Test
    void shouldMoveCorrectly() {
        ball = new Ball(100.0d, 100.0d);
        double xDisp = 2.0d;
        double yDisp = -1.0d;
        ball.move(xDisp, yDisp);
        assertEquals(102.0d, ball.getX());
        assertEquals(99.0d, ball.getY());
    }

    @Test
    void shouldCorrectlyCreateObjectWithXAndY() {
        double x = 65.0d;
        double y = 88.0d;
        ball = new Ball(x, y);
        assertEquals(x, ball.getX());
        assertEquals(y, ball.getY());
    }

    @Test
    void shouldReturnCorrectString() {
        double x = 55.0d;
        double y = 11.0d;
        ball.setXY(x, y);
        assertEquals("X: 55.0\nY: 11.0", ball.toString());
    }
}