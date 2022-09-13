package com.mirea.lab.third_assignment.task_one;

public class Circle {

    private Point point;
    private double radius;

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public Circle(int x, int y, double radius) {
        point = new Point(x, y);
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Radius: " + radius + " | " + point;
    }
}
