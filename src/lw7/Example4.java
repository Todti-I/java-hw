package lw7;

import java.io.*;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        File file = new File("src/lw7/example_file.txt");

        System.out.print("Введите данные для записи в файл: ");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        scanner.close();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(data);
            System.out.printf("Данные записаны в файл: %s\n", file.getAbsolutePath());
        } catch (IOException e) {
            System.out.printf("Ошибка при записи в файл: %s\n", e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
            System.out.printf("Прочитанные данные: %s\n", readData);
        } catch (IOException e) {
            System.out.printf("Ошибка при чтении файла: %s\n", e.getMessage());
        }

        boolean isFileDeleted = file.delete();
        if (isFileDeleted) {
            System.out.printf("Файл удален: %s\n", file.getAbsolutePath());
        } else {
            System.out.printf("Не удалось удалить файл: %s\n", file.getAbsolutePath());
        }
    }
}
