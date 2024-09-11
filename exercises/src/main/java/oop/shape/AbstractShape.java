package oop.shape;

public abstract class AbstractShape implements Movable, Resizable, Computable {
    protected String color;
    protected String id;

    protected AbstractShape(String id, String color) {
        this.id = id;
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setColor(String color) {
        if (!color.matches("^#[0-9a-fA-F]{6}")) {
            throw new IllegalArgumentException("Invalid RGB Color (#RRGGBB)");
        }
        this.color = color;
    }
}
