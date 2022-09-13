package com.mirea.lab.second_assignment.src;

public class Circle {
    private final Point point;
    private double radius;

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public Circle(double radius) {
        this.point = new Point(0.0d, 0.0d);
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
}
