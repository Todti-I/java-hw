package timus;

import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1820

public class Task1820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        int result;

        if (k > n) {
            result = 2;
        } else if (2 * n % k >= 1) {
            result = 2 * n / k + 1;
        } else {
            result = 2 * n / k;
        }

        System.out.println(result);
    }
}
