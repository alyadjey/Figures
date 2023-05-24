package figures;

import utils.Constants;
import utils.RandomUtils;
public class FigureGenerator {
    public static final int MAX_NUMBER_OF_FIGURES = 10;

    public static Figure generateRandomFigure() {
        String color = getRandomColor();

        int figureType = RandomUtils.generateRandomInt(1, 4);
        switch (figureType) {
            case 1:
                double sideLength = RandomUtils.generateRandomDouble(1, 10);
                return new Square(sideLength, color);
            case 2:
                double hypotenuse = RandomUtils.generateRandomDouble(1, 10);
                double base = RandomUtils.generateRandomDouble(1, 10);
                double height = RandomUtils.generateRandomDouble(1, 10);
                return new Triangle(hypotenuse, base, height, color);
            case 3:
                double radius = RandomUtils.generateRandomDouble(1, 10);
                return new Circle(radius, color);
            case 4:
                double base1 = RandomUtils.generateRandomDouble(1, 10);
                double base2 = RandomUtils.generateRandomDouble(1, 10);
                double trapezoidHeight = RandomUtils.generateRandomDouble(1, 10);
                return new Trapezoid(base1, base2, trapezoidHeight, color);
            default:
                throw new IllegalArgumentException("Невідомий тип фігури: " + figureType);
        }
    }

    private static String getRandomColor() {
        int randomIndex = RandomUtils.generateRandomInt(0, Constants.COLORS.length - 1);
        return Constants.COLORS[randomIndex];
    }
}