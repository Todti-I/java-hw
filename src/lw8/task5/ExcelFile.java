package lw8.task5;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFile {
    public static void read(String filePath) {
        try (FileInputStream inputStream = new FileInputStream(filePath);
             XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {
            XSSFSheet sheet = workbook.getSheet("Товары");
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.printf("%s\t", cell);
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.printf("Файл не найден: %s\n", e.getMessage());
        } catch (IOException e) {
            System.out.printf("Не удалось прочитать из файла: %s\n", e.getMessage());
        }
    }

    public static void write(String filePath) {
        try (XSSFWorkbook workbook = new XSSFWorkbook();
             FileOutputStream outputStream = new FileOutputStream(filePath)) {
            XSSFSheet sheet = workbook.createSheet("Товары");

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Товар");
            headerRow.createCell(1).setCellValue("Характеристики");
            headerRow.createCell(2).setCellValue("Стоимость");

            Row dataRow1 = sheet.createRow(1);
            dataRow1.createCell(0).setCellValue("Книга");
            dataRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
            dataRow1.createCell(2).setCellValue(500.0);

            Row dataRow2 = sheet.createRow(2);
            dataRow2.createCell(0).setCellValue("Компьютер");
            dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память: 16 GB");
            dataRow2.createCell(2).setCellValue(25000.0);

            workbook.write(outputStream);

            System.out.printf("Данные записаны в файл: %s\n", filePath);
        } catch (FileNotFoundException e) {
            System.out.printf("Файл не найден: %s\n", e.getMessage());
        } catch (IOException e) {
            System.out.printf("Не удалось записать в файл: %s\n", e.getMessage());
        }
    }
}