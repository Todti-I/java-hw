package timus;

import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=2100

public class Task2100 {
    public static void main(String[] args) {
        int guestsCount = 2;
        int priceForOnePerson = 100;
        int unluckyNumber = 13;

        Scanner scanner = new Scanner(System.in);
        int invitationsCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < invitationsCount; i++) {
            String answer = scanner.nextLine();
            guestsCount += answer.endsWith("+one") ? 2 : 1;
        }
        scanner.close();

        if (guestsCount == unluckyNumber) {
            guestsCount += 1;
        }

        System.out.println(guestsCount * priceForOnePerson);
    }
}
