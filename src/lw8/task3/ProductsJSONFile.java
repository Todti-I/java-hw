package lw8.task3;

import lw8.task2.Product;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@SuppressWarnings({"unchecked", "rawtypes"})
public class ProductsJSONFile {
    private File file;
    private JSONArray jsonArray;

    public ProductsJSONFile(String filePath) {
        try {
            file = new File(filePath);
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(filePath));
            jsonArray = (JSONArray) obj;
        } catch (ParseException | IOException e) {
            System.out.printf("Не удалось открыть файл: %s\n", e.getMessage());
        }
    }

    public void add(String name, String price) {
        UUID id = UUID.randomUUID();

        JSONObject newProduct = new JSONObject();
        newProduct.put("id", id.toString());
        newProduct.put("name", name);
        newProduct.put("price", price);

        jsonArray.add(newProduct);

        System.out.printf("Продукт \"%s\" успешно добавлен\n", id);
    }

    public List<Product> searchByName(String name) {
        Iterator iterator = jsonArray.iterator();
        List<Product> products = new ArrayList<>();

        while (iterator.hasNext()) {
            JSONObject product = (JSONObject) iterator.next();
            if (name.equals(product.get("name"))) {
                products.add(new Product(
                        UUID.fromString(product.get("id").toString()),
                        product.get("name").toString(),
                        product.get("price").toString()
                ));
            }
        }

        return products;
    }

    public void removeById(UUID id) {
        Iterator iterator = jsonArray.iterator();

        while (iterator.hasNext()) {
            JSONObject product = (JSONObject) iterator.next();
            if (id.toString().equals(product.get("id"))) {
                iterator.remove();
            }
        }
    }

    public void close() {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(jsonArray.toJSONString());
            System.out.println("Файл успешно сохранен!");
        } catch (Exception e) {
            System.out.printf("Не удалось сохранить файл: %s\n", e.getMessage());
        }
    }
}
