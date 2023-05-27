package timus;

import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1209

public class Task1209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            long position = scanner.nextLong();
            double answer = (Math.sqrt(8 * position - 7) - 1) / 2;
            System.out.println(answer % 1 == 0 ? 1 : 0);
        }

        scanner.close();
    }
}
