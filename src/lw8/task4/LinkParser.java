package lw8.task4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkParser {
    private final int maxAttempt = 5;
    private final List<String> links;

    public LinkParser(String url) {
        links = loadLinks(url, 0);
        System.out.printf("Загружено %d\n", links.size());
    }

    public void saveToFile(String filePath) {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(String.join("\n", links));
            System.out.println("Ссылки успешно сохранены в файл!");
        } catch (IOException e) {
            System.out.printf("Не удалось сохранить ссылки в файл %s\n", e.getMessage());
        }
    }

    private List<String> loadLinks(String url, int attempt) {
        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");

            return links.stream()
                    .map(link -> link.attr("abs:href"))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.out.printf(
                    "Не удалось загрузить сайт, попытка %d/%d. %s\n",
                    attempt, maxAttempt, e.getMessage()
            );
            if (attempt < maxAttempt) {
                return loadLinks(url, attempt + 1);
            }
            return new ArrayList<>();
        }
    }
}
