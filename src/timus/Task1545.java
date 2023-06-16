package timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://acm.timus.ru/problem.aspx?space=1&num=1545

public class Task1545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hieroglyphsCount = scanner.nextInt();
        List<String> hieroglyphs = new ArrayList<>();
        scanner.nextLine();

        for (int i = 0; i < hieroglyphsCount; i++) {
            hieroglyphs.add(scanner.nextLine());
        }

        String hieroglyphStart = scanner.nextLine();
        scanner.close();

        List<String> searchingHieroglyphs = hieroglyphs.stream()
                .filter(h -> h.startsWith(hieroglyphStart))
                .collect(Collectors.toList());

        System.out.println(String.join("\n", searchingHieroglyphs));
    }
}
