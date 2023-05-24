package figures;
public class Square extends Figure {
    private double sideLength;

    public Square(double sideLength, String color) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        double area = calculateArea();
        System.out.println("Малюю квадрат кольору " + color + " зі стороною " + String.format("%.1f", sideLength) + ", площа: " + String.format("%.1f", area));
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}