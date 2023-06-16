package timus;

import java.util.HashMap;
import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1225

public class Task1225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        long result = 2 * Fibonacci.calculate(n);

        System.out.println(result);
    }

    private static class Fibonacci {
        private static final HashMap<Integer, Long> values = new HashMap<>() {{
            put(0, 0L);
            put(1, 1L);
        }};

        public static long calculate(int n) {
            if (values.containsKey(n)) {
                return values.getOrDefault(n, 0L);
            }
            long value = calculate(n - 1) + calculate(n - 2);
            values.put(n, value);
            return value;
        }
    }
}
