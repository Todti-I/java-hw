package lw1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.print("Input year of birth: ");
        int yearOfBirth = in.nextInt();

        in.close();

        int currentYear = LocalDateTime.now().getYear();
        int age = currentYear - yearOfBirth;

        System.out.printf("%s is %d years old\n", name, age);
    }
}
