package lw1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        in.close();

        int sum = a + b;
        int difference = Math.abs(a - b);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
