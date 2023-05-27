package timus;

import java.util.Scanner;

public class Task1787 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();

        int totalCars = 0;
        for (int i = 0; i < n; i++) {
            totalCars += scanner.nextInt();
            totalCars = Math.max(0, totalCars - k);
        }

        scanner.close();
        System.out.println(totalCars);
    }
}
