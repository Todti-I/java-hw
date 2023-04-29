package lw4;

public class Example14 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива = " + l);
            System.out.println(calc(l));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }

    private static int calc(int x) throws ArithmeticException {
        return 10 / x;
    }
}
