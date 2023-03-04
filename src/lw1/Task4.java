package lw1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month: ");
        String month = in.next();

        System.out.println("Input days count in month: ");
        int count = in.nextInt();

        System.out.printf("%s has %d days\n", month, count);
        in.close();
    }
}
