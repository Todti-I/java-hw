package lw7;

import java.io.File;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        File folder = new File("src/lw7/example_folder");
        if (folder.exists()) {
            System.out.printf("Папка уже существует: %s\n", folder.getAbsolutePath());
        } else {
            boolean isCreated = folder.mkdir();
            if (isCreated) {
                System.out.printf("Папка создана: %s\n", folder.getAbsolutePath());
            } else {
                System.out.printf("Не удалось создать папку: %s\n", folder.getAbsolutePath());
            }
        }

        File file = new File(folder.getAbsolutePath() + File.separator + "example_file.txt");
        try {
            boolean isCreated = file.createNewFile();
            if (isCreated) {
                System.out.printf("Файл создан: %s\n", file.getAbsolutePath());
            } else {
                System.out.printf("Не удалось создать файл: %s\n", file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.printf("Ошибка при создании файла: %s\n", e.getMessage());
        }

        boolean isFileDeleted = file.delete();
        if (isFileDeleted) {
            System.out.printf("Файл удален: %s\n", file.getAbsolutePath());
        } else {
            System.out.printf("Не удалось удалить файл: %s\n", file.getAbsolutePath());
        }

        boolean isFolderDeleted = folder.delete();
        if (isFolderDeleted) {
            System.out.printf("Папка удалена: %s\n", folder.getAbsolutePath());
        } else {
            System.out.printf("Не удалось удалить папку: %s\n", folder.getAbsolutePath());
        }
    }
}
