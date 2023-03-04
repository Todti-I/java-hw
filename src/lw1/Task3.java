package lw1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day of week: ");
        String dayOfWeek = in.next();

        System.out.println("Input day: ");
        int day = in.nextInt();

        System.out.println("Input month: ");
        String month = in.next();

        System.out.printf("%s %d %s\n", dayOfWeek, day, month);
        in.close();
    }
}
