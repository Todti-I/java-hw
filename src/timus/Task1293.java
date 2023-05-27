package timus;

import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1293

public class Task1293 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int result = n * a * b * 2;

        System.out.println(result);
    }
}
