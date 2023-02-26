package lw1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input age: ");
        int age = in.nextInt();

        in.close();

        int currentYear = LocalDateTime.now().getYear();
        int yearOfBirth = currentYear - age;

        System.out.println("Your year of birth is " + yearOfBirth);
    }
}
