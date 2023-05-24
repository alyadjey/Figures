package figures;
public class Triangle extends Figure {
    private double hypotenuse;
    private double base;
    private double height;

    public Triangle(double hypotenuse, double base, double height, String color) {
        super(color);
        this.hypotenuse = hypotenuse;
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        double area = calculateArea();
        System.out.println("Малюю трикутник кольору " + color + " зі стороною " + String.format("%.1f", hypotenuse) +
                ", основою " + String.format("%.1f", base) + " і висотою " + String.format("%.1f", height) + ", площа: " + String.format("%.1f", area));
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }
}