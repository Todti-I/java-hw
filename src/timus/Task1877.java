package timus;

import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1877

public class Task1877 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codeOne = scanner.nextInt();
        int codeTwo = scanner.nextInt();
        scanner.close();

        if (codeOne % 2 == 0 || codeTwo % 2 != 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
