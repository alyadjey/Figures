import figures.Figure;

import java.util.ArrayList;
import java.util.List;

import figures.FigureGenerator;
import utils.RandomUtils;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = generateFigures();
        printFigures(figures);
    }

    private static List<Figure> generateFigures() {
        List<Figure> figures = new ArrayList<>();

        int numberOfFigures = getRandomNumberOfFigures();

        for (int i = 0; i < numberOfFigures; i++) {
            Figure figure = FigureGenerator.generateRandomFigure();
            figures.add(figure);
        }

        return figures;
    }

    private static int getRandomNumberOfFigures() {
        return RandomUtils.generateRandomInt(1, FigureGenerator.MAX_NUMBER_OF_FIGURES);
    }

    private static void printFigures(List<Figure> figures) {
        System.out.println("Створені фігури:");
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}