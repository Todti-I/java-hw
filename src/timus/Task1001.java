package timus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1001

public class Task1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> numbers = new ArrayList<>();

        while (scanner.hasNextLong()) {
            numbers.add(scanner.nextLong());
        }

        scanner.close();
        Collections.reverse(numbers);
        numbers.forEach(n -> System.out.printf("%.4f\n", Math.sqrt(n)));
    }
}
