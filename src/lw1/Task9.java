package lw1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        int x = in.nextInt();

        in.close();

        int x1 = x - 1;
        int x2 = x + 1;
        int x3 = x * x + x1 * x1 + x2 * x2;

        System.out.printf("%d %d %d %d\n", x, x1, x2, x3);
    }
}
