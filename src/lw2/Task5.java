package lw2;

public class Task5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8, 5);
        System.out.printf(
                "Длина = %d, Ширина = %d, Периметр = %d, Площадь = %d\n",
                rectangle.getLength(),
                rectangle.getWidth(),
                rectangle.getPerimeter(),
                rectangle.getSquare()
        );
        rectangle.setLength(10).setWidth(6);
        System.out.println(rectangle);
    }
}

class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public Rectangle setLength(int length) {
        this.length = length;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Rectangle setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getPerimeter() {
        return 2 * length + 2 * width;
    }

    public int getSquare() {
        return length * width;
    }

    @Override
    public String toString() {
        return String.format("Длина = %d, Ширина = %d", length, width);
    }
}
