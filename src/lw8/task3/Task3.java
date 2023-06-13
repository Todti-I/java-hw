package lw8.task3;

import lw8.task2.Product;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    private final static Scanner scanner = new Scanner(System.in);
    private final static ProductsJSONFile jsonFile = new ProductsJSONFile("src/lw8/task3/products.json");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Runnable> commands = new HashMap<>();
        commands.put("add", Task3::addProduct);
        commands.put("search", Task3::searchProducts);
        commands.put("remove", Task3::removeProduct);
        commands.put("exit", Task3::exit);
        commands.put("help", () ->
                System.out.printf("Все комманды: %s\n", String.join(", ", commands.keySet()))
        );

        commands.get("help").run();
        while (true) {
            System.out.print("Введите комманду: ");
            String command = scanner.next();
            if (commands.containsKey(command)) {
                commands.get(command).run();
            } else {
                System.out.println("Неизвестная комманда");
            }
            if (command.equals("exit")) {
                break;
            }
            System.out.println();
        }
    }

    private static void addProduct() {
        System.out.print("Введите название продукта: ");
        String name = scanner.nextLine();
        System.out.print("Введите цену продукта: ");
        String price = scanner.nextLine();
        jsonFile.add(name, price);
    }

    private static void searchProducts() {
        System.out.print("Введите название продукта: ");
        String name = scanner.nextLine();
        List<String> productLabels = jsonFile.searchByName(name)
                .stream()
                .map(Product::toString)
                .collect(Collectors.toList());
        System.out.println(String.join("\n", productLabels));
    }

    private static void removeProduct() {
        try {
            System.out.print("Введите ID продукта: ");
            UUID id = UUID.fromString(scanner.nextLine());
            jsonFile.removeById(id);
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный ID продукты");
        }
    }

    private static void exit() {
        jsonFile.close();
        scanner.close();
    }
}
