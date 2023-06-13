package lw7;

import java.io.*;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Файл не найден");
            return;
        }
        System.out.print("Введите слово для поиска: ");
        String searchWord = scanner.nextLine();
        scanner.close();
        
        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String line;
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(searchWord)) {
                    System.out.printf("Строка %d: %s\n", lineNumber, line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.printf("Ошибка при чтении файла: %s\n", e.getMessage());
        }
    }
}
