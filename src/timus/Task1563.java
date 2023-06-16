package timus;

import java.util.HashSet;
import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1563

public class Task1563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repetitionsCount = 0;
        HashSet<String> shops = new HashSet<>();
        int shopsCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < shopsCount; i++) {
            String shop = scanner.nextLine();
            if (shops.contains(shop)) {
                repetitionsCount += 1;
            } else {
                shops.add(shop);
            }
        }

        scanner.close();
        System.out.println(repetitionsCount);
    }
}
