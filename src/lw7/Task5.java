package lw7;

import java.io.File;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        
        if (file.exists()) {
            long fileSize = file.length();
            System.out.printf("Размер файла %s составляет %d байт", file.getName(), fileSize);
            return;
        }

        System.out.println("Файл не найден");
    }
}
