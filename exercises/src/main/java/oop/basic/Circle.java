package oop.basic;

import java.awt.*;

public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        setCenter(center);
        setRadius(radius);
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    public boolean contains(Point point) {
        return center.distance(point) < radius;
    }

    public void translate(int dx, int dy) {
        center.translate(dx, dy);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
