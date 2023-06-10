package lw7;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example5 {
    public static void main(String[] args) {
        File inputFile = new File("src/lw7/input.txt");
        File outputFile = new File("src/lw7/output.txt");

        try (
                InputStream inputStream = new FileInputStream(inputFile);
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                OutputStream outputStream = new FileOutputStream(outputFile);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }
            System.out.printf("Данные записаны в файл: %s\n", outputFile);
        } catch (IOException e) {
            System.out.printf("Ошибка при чтении/записи файла: %s\n", e.getMessage());
        }
    }
}
