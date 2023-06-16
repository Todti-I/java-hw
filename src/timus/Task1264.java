package timus;

import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1264

public class Task1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        int result = n * (m + 1);

        System.out.println(result);
    }
}
