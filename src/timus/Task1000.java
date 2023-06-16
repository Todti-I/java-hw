package timus;

import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1000

public class Task1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int result = a + b;
        System.out.println(result);
    }
}
