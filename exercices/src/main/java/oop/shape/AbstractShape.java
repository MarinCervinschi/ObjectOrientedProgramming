package oop.shape;

import java.awt.*;

public abstract class AbstractShape implements Computable, Movable, Resizable {
    String color;
    String id;

    public AbstractShape(String color, String id) {
        this.color = color;
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.matches("^#[0-9a-fA-F]{6}")) {
            throw new IllegalArgumentException("Invalid RGB Color (#RRGGBB)");
        }
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract double getPerimeter();

    @Override
    public abstract void move(Point movement);
    @Override
    public abstract void resize(double scale);
}
