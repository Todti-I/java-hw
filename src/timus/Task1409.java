package timus;

import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1409

public class Task1409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int harry = scanner.nextInt();
        int larry = scanner.nextInt();
        scanner.close();

        int harryNotShot = larry - 1;
        int larryNotShot = harry - 1;

        System.out.printf("%d %d\n", harryNotShot, larryNotShot);
    }
}
