package lw3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = in.nextInt();
        int[] array = new int[length];
        fillArray(array, 0);
        in.close();

        System.out.println("Итогвый массив: " + Arrays.toString(array));
    }


    private static void fillArray(int[] array, int count) {
        if (count < array.length) {
            System.out.print("Введите число: ");
            int value = in.nextInt();
            array[count] = value;
            fillArray(array, count + 1);
        }
    }
}
