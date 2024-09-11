package oop.basic;

import java.awt.*;
import java.util.Arrays;

/**
 * A class representing an irregular polygon.
 */
public class Polygon {
    final Point[] vertices;

    /**
     * Creating the polygon.
     * @param vertices a Point array representing the vertices
     */
    public Polygon(Point[] vertices) {
        if (vertices.length < 3) {
            throw new IllegalArgumentException("Al least three vertices are required");
        }
        this.vertices = vertices;
    }

    /**
     *
     * @return the number of vertices.
     */
    public int getVerticesCount() {
        return vertices.length;
    }

    /**
     *
     * @return the perimeter of the polygon.
     */
    public double getPerimeter() {
        double p = 0;
        for (int i = 0; i < getVerticesCount(); i++) {
            int next = (i + 1) % getVerticesCount();
            p += Math.sqrt(Math.pow((vertices[next].x - vertices[i].x), 2) +
                           Math.pow((vertices[next].y - vertices[i].y), 2));
        }
        return p;
    }

    /**
     *
     * @return the area of the polygon.
     */
    public double getArea() {
        double area = 0;
        for (int i = 0; i < getVerticesCount(); i++) {
            int next = (i + 1) % getVerticesCount();
            area += ((vertices[next].x * vertices[i].y) - (vertices[next].y * vertices[i].x));
        }
        return Math.abs(area / 2);
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }
}
