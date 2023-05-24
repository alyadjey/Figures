package figures;

public abstract class Figure {
    protected String color;

    protected Figure(String color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract double calculateArea();
}