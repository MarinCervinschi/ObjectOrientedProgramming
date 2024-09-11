package oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape {
    Point bottomRight;
    Point upperLeft;

    public Rectangle(String id, String color, Point upperLeft, Point bottomRight) {
        super(id, color);
        this.bottomRight = bottomRight;
        this.upperLeft = upperLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }
    @Override
    public void move(Point point) {
        upperLeft.translate(point.x, point.y);
        bottomRight.translate(point.x, point.y);
    }

    @Override
    public void resize(double r) {
        double newX = upperLeft.getX() + ((bottomRight.getX() - upperLeft.getX()) * r);
        double newY = upperLeft.getY() - ((upperLeft.getY() - bottomRight.getY()) * r);
        bottomRight.setLocation(newX, newY);
    }

    @Override
    public double getPerimeter() {
        return ((upperLeft.getY() - bottomRight.getY()) + (bottomRight.getX() - upperLeft.getX())) * 2.0;
    }

    @Override
    public double getArea() {
        return (upperLeft.getY() - bottomRight.getY()) * (bottomRight.getX() - upperLeft.getX());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "bottomRight=" + bottomRight +
                ", upperLeft=" + upperLeft +
                ", color='" + color + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
