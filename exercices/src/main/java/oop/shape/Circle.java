package oop.shape;

import java.awt.*;

public class Circle extends AbstractShape{
    protected Point center;
    protected double radius;

    public Circle(String color, String id, Point center, double radius) {
        super(color, id);
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
    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public void move(Point movement) {
       center.setLocation(movement);
    }

    @Override
    public void resize(double scale) {
        radius *= scale;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
