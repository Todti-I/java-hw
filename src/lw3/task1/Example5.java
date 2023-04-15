package lw3.task1;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    private static int fact(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        System.out.printf("%d %d\n", (n - 2), (n - 1));
        return fact(n - 2) + fact(n - 1);
    }
}
