package lw8.task2;

import java.util.UUID;

public class Product {
    private final UUID id;
    private final String name;
    private final String price;

    public Product(UUID id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Product: id=%s, name=%s, price=%s", id, name, price);
    }
}
