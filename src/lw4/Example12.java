package lw4;

public class Example12 {
    public static void main(String[] args) {
        try {
            ensureValid(null, 0.000001);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void ensureValid(String str, double number) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (number > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }
}
