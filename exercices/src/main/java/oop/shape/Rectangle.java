package oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape{
    protected Point bottomRight;
    protected Point upperLeft;

    public Rectangle(String color, String id, Point bottomRight, Point upperLeft) {
        super(color, id);
        this.bottomRight = bottomRight;
        this.upperLeft = upperLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    @Override
    public double getArea() {
        return (bottomRight.x - upperLeft.x) * (upperLeft.y - bottomRight.y);
    }

    @Override
    public double getPerimeter() {
        return ((bottomRight.x - upperLeft.x) + (upperLeft.y - bottomRight.y)) * 2;
    }

    public void move(Point movement) {
        upperLeft.translate(movement.x, movement.y);
        bottomRight.translate(movement.x, movement.y);
    }

    @Override
    public void resize(double scale) {
        bottomRight.x = (int) (upperLeft.x + ((bottomRight.x - upperLeft.x) * scale));
        bottomRight.y = (int) (upperLeft.y - ((upperLeft.y - bottomRight.y) * scale));
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
