package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int numberOfFigures = 6;
        Figure[] figures = new Figure[numberOfFigures];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i > figures.length / 2
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
