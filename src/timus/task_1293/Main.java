package timus.task_1293;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        in.close();

        int result = n * a * b * 2;

        System.out.println(result);
    }
}
