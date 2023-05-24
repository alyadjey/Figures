package figures;
public class Trapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double base1, double base2, double height, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public void draw() {
        double area = calculateArea();
        System.out.println("Малюю трапецію кольору " + color + " з нижньою основою " + String.format("%.1f", base1) +
                ", верхньою основою " + String.format("%.1f", base2) + " і висотою " + String.format("%.1f", height) + ", площа: " + String.format("%.1f", area));
    }

    @Override
    public double calculateArea() {
        return (base1 + base2) * height / 2;
    }
}