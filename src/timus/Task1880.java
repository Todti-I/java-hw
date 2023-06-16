package timus;

import java.util.HashMap;
import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1880

public class Task1880 {
    public static void main(String[] args) {
        int playersCount = 3;

        HashMap<Integer, Integer> numbersRepetitionCount = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < playersCount; i++) {
            int numbersCount = scanner.nextInt();
            for (int j = 0; j < numbersCount; j++) {
                int number = scanner.nextInt();
                int repetitionCount = numbersRepetitionCount.getOrDefault(number, 0);
                numbersRepetitionCount.put(number, repetitionCount + 1);
            }
        }
        scanner.close();

        long generalNumbersCount = numbersRepetitionCount.values()
                .stream()
                .filter(n -> n == playersCount)
                .count();

        System.out.println(generalNumbersCount);
    }
}
