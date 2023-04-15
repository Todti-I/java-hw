package lw3;

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, (i % 3 == 1 ? "big_str_" : "str_") + i);
        }

        int result = 1;

        for (int key : map.keySet()) {
            String value = map.get(key);
            if (key > 5) {
                System.out.printf("Значение по ключ %d: %s\n", key, value);
            }
            if (key == 0) {
                System.out.println("Все значениея: " + map.values());
            }
            if (value.length() > 5) {
                result *= key;
            }
        }

        System.out.println("Произведение ключей, чья длина значений больше 5: " + result);
    }
}
