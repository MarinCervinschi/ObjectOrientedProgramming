package oop.basic;

import java.awt.*;

/**
     * A class representing a Circle on a 2D plane.
     */
public class Circle {
    Point center;
    int radius;

    /**
     * Creating the circle
     * @param center a Point representing the center
     * @param radius integer representing the radius
     */
    public Circle(Point center, int radius) {
        setCenter(center);
        setRadius(radius);
    }

    /**
     *
     * @return the center of a circle
     */
    public Point getCenter() {
        return center;
    }

    /**
     *
     * @return the radius of a circle
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Set the center of the circle
     * @param center is the point representing the center of a circle
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Set the radius of the circle
     * @param radius is the integer representing the radius
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * Returning the perimeter of the circle
     * @return the perimeter
     */
    public double getPerimeter() {
        return getRadius() * 2 * Math.PI;
    }

    /**
     * Returning the area of the circle
     * @return the area
     */
    public double getArea() {
        return (getRadius() * getRadius()) * Math.PI;
    }

    /**
     * Returning true if point is contained within the circle
     * @param point the point to be confronted
     * @return true or false
     */
    public boolean contains(Point point) {
        return point.x < getRadius() && point.y < getRadius();
    }

    /**
     * Moving the circle on the 2D plane
     * @param dx x components of the translation vector
     * @param dy y components of the translation vector
     */
    public void translate(int dx, int dy) {
        getCenter().setLocation(dx, dy);
    }

    @Override
    public String toString() {
        return getCenter().toString();
    }
}
