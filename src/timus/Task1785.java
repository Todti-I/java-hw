package timus;

import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1785

public class Task1785 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number >= 1 && number <= 4) {
            System.out.println("few");
            return;
        }

        if (number >= 5 && number <= 9) {
            System.out.println("several");
            return;
        }

        if (number >= 10 && number <= 19) {
            System.out.println("pack");
            return;
        }

        if (number >= 20 && number <= 49) {
            System.out.println("lots");
            return;
        }

        if (number >= 50 && number <= 99) {
            System.out.println("horde");
            return;
        }

        if (number >= 100 && number <= 249) {
            System.out.println("throng");
            return;
        }

        if (number >= 250 && number <= 499) {
            System.out.println("swarm");
            return;
        }

        if (number >= 500 && number <= 999) {
            System.out.println("zounds");
            return;
        }

        if (number >= 1000) {
            System.out.println("legion");
            return;
        }

        throw new Exception("Unable to translate number");
    }
}
