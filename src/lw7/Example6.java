package lw7;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example6 {
    public static void main(String[] args) {
        File inputFile = new File("src/lw7/input.txt");
        File outputFile = new File("src/lw7/output.txt");

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
                PrintWriter printWriter = new PrintWriter(outputFile, StandardCharsets.UTF_8)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }
            System.out.printf("Данные записаны в файл: %s\n", outputFile);
        } catch (IOException e) {
            System.out.printf("Ошибка при чтении/записи файла: %s\n", e.getMessage());
        }
    }
}
