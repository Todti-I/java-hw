package timus;

import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=2012

public class Task2012 {
    public static void main(String[] args) {
        int totalTasks = 12;
        int minRemainingTasks = 60 * 4 / 45;

        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        scanner.close();

        if (totalTasks - f <= minRemainingTasks) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
