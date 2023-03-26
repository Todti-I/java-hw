package lw2;

public class Task6 {
    public static void main(String[] args) {
        IFigure[] figures = {new Square(4), new Circle(4.5)};
        for (IFigure figure : figures) {
            System.out.printf("%s | Периметр = %.1f Площадь = %.1f\n",
                    figure,
                    figure.getPerimeter(),
                    figure.getSquare()
            );
        }
    }
}

interface IFigure {
    double getPerimeter();

    double getSquare();
}

final class Square implements IFigure {
    private final double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getSquare() {
        return length * length;
    }

    @Override
    public String toString() {
        return String.format("[Квадрат] Длина = %.1f", length);
    }
}

final class Circle implements IFigure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("[Круг] Радиус = %.1f", radius);
    }
}
