package timus;

import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1639

public class Task1639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        boolean isEven = m * n % 2 == 0;

        System.out.println(isEven ? "[:=[first]" : "[second]=:]");
    }
}
