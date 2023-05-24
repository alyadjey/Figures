package figures;
public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        double area = calculateArea();
        System.out.println("Малюю коло кольору " + color + " з радіусом " + String.format("%.1f", radius) + ", площа: " + String.format("%.1f", area));
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}