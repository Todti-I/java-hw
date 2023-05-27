package timus;

import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=2001

public class Task2001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();

        scanner.nextInt();
        int b2 = scanner.nextInt();

        int a3 = scanner.nextInt();
        scanner.nextInt();
        scanner.close();

        System.out.printf("%d %d\n", a1 - a3, b1 - b2);
    }
}
