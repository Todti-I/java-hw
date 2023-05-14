package lw4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите длину массива: ");
            int length = scanner.nextInt();
            int[] array = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.print("Введите элемент массива: ");
                array[i] = scanner.nextInt();
            }
            OptionalDouble average = Arrays.stream(array).filter(value -> value > 0).average();
            if (average.isEmpty()) {
                throw new NoPositiveValues();
            }
            System.out.printf("Среднее значение = %.1f", average.getAsDouble());
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Ввод строки вместо числа");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Несоответствие числового типа данных");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: Длина массива не может быть отрицательной");
        } catch (NoPositiveValues e) {
            System.out.printf("Ошибка: %s\n", e.getMessage());
        }
    }

    private static class NoPositiveValues extends Exception {
        @Override
        public String getMessage() {
            return "Положительные элементы отсутствуют";
        }
    }
}
