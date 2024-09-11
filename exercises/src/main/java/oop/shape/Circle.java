package oop.shape;

import java.awt.*;

public class Circle extends AbstractShape {
    Point center;
    double radius;

    public Circle(String id, String color, Point center, double radius) {
        super(id, color);
        this.center = center;
        this.radius = radius;
    }
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void move(Point point) {
        center.translate(point.x, point.y);
    }

    @Override
    public void resize(double r) {
        radius *= r;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", id='" + id + '\'' +
                ", center=" + center +
                '}';
    }
}
