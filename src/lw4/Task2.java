package lw4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ширину матрицы: ");
            int width = scanner.nextInt();
            System.out.print("Введите высоту матрицы: ");
            int height = scanner.nextInt();
            int[][] matrix = new int[width][height];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("Введите элемент матрицы: ");
                    matrix[j][i] = scanner.nextInt();
                }
            }
            System.out.print("Введите номер столбца: ");
            int column = scanner.nextInt();
            System.out.print(Arrays.toString(matrix[column]));
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Ввод строки вместо числа");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Нет столбца с таким номером");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: Матрица не может быть с отрицательной шириной и высотой");
        }
    }
}
