package lw4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите длину массива: ");
            int length = scanner.nextInt();
            byte[] array = new byte[length];
            for (int i = 0; i < length; i++) {
                System.out.print("Введите элемент массива: ");
                array[i] = scanner.nextByte();
            }
            byte sum = 0;
            for (byte e : array) {
                sum += e;
            }
            System.out.printf("Сумма элементов = %d\n", sum);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Ввод строки вместо числа");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: Длина массива не может быть отрицательной");
        }
    }
}
