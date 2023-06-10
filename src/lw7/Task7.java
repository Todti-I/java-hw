package lw7;

import java.io.*;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст для записи: ");
        String text = scanner.nextLine();
        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        scanner.close();

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(text);
            System.out.printf("Количество записанных символов: %s\n", text.length());
        } catch (IOException e) {
            System.out.printf("Ошибка при записи файла: %s\n", e.getMessage());
        }
    }
}
