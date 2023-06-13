package lw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        File inputFile = new File("src/lw7/input.txt");

        try (
                FileReader fileReader = new FileReader(inputFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            System.out.printf("Считаю количество строк в %s\n", inputFile.getAbsolutePath());
            int counter = 0;
            while (bufferedReader.readLine() != null) {
                counter++;
            }
            System.out.printf("Количество строк в файле: %d\n", counter);
        } catch (IOException e) {
            System.out.printf("Ошибка при чтении файла: %s\n", e.getMessage());
        }
    }
}
