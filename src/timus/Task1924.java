package timus;

import java.util.Scanner;
import java.util.stream.IntStream;

// https://acm.timus.ru/problem.aspx?space=1&num=1924

public class Task1924 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int numbersSum = IntStream.range(1, n + 1).sum();
        String result = numbersSum % 2 == 0 ? "black" : "grimy";

        System.out.println(result);
    }
}
