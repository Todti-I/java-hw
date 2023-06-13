package lw7;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        File inputFile = new File("src/lw7/input.txt");
        File outputFile = new File("src/lw7/output.txt");

        try (
                FileReader fileReader = new FileReader(inputFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(outputFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.printf("Текст скопирован в файл: %s\n", outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.printf("Ошибка при копирование текста: %s\n", e.getMessage());
        }
    }
}
