package lw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для перевода в двоичную систему счисления: ");
        int value = in.nextInt();
        in.close();

        printBinaryNumber(value);
    }

    private static void printBinaryNumber(int number) {
        if (number > 0) {
            printBinaryNumber(number / 2);
            System.out.print(number % 2);
        }
    }
}
