package lw1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        in.close();

        int result = a + b;

        System.out.printf("%d + %d = %d\n", a, b, result);
    }
}
