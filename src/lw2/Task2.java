package lw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер двумерного массива: ");
        int size = in.nextInt();
        in.close();

        if (size < 1) {
            throw new Exception("Размер двумерного массива должен быть больше 0");
        }

        System.out.printf("Размер двумерного массива = %d\n", size);

        int[][] array = new int[size][size];
        int counter = 0;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < size; j++) {
                    array[i][j] = counter++;
                }
            } else {
                for (int j = size - 1; j >= 0; j--) {
                    array[i][j] = counter++;
                }
            }
        }

        for (int[] yAxis : array) {
            for (int xAxis : yAxis) {
                System.out.printf("%d\t", xAxis);
            }
            System.out.print("\n");
        }
    }
}
