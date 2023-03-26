package lw2;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        in.close();

        if (size < 1) {
            throw new Exception("Размер массива должен быть больше 0");
        }

        System.out.printf("Размер массива = %d\n", size);

        int[] nums = new int[size];
        int minValue = Integer.MAX_VALUE;
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
            minValue = Integer.min(minValue, nums[i]);
            System.out.printf("Элемент массив [%d] = %d\n", i, nums[i]);
        }

        System.out.printf("\nМинимальное значение = %d\n", minValue);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == minValue) {
                System.out.printf("Индекс минимального значения = %d\n", i);
            }
        }
    }
}
