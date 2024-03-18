package oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape{
    protected Point bottomRight;
    protected Point upperLeft;

    public Rectangle(String id, String color, Point upperLeft, Point bottomRight) {
        super(id, color);
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
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
        return "Rectangle{" + "upperLeft=" + upperLeft + ", bottomRight=" + bottomRight + ", id='" + id + '\'' + ", color=" + color + '}';
    }
}
