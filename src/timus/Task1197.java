package timus;

import java.util.Arrays;
import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1197

public class Task1197 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < testCount; i++) {
            String position = scanner.nextLine();
            int x = position.charAt(0) - 'a';
            int y = position.charAt(1) - '1';

            long movesCount = Arrays.stream(moves).filter(m -> {
                if (m.offsetX < 0) {
                    if (m.offsetY < 0) {
                        return x + m.offsetX >= 0 && y + m.offsetY >= 0;
                    }
                    return x + m.offsetX >= 0 && y + m.offsetY < 8;
                } else {
                    if (m.offsetY < 0) {
                        return x + m.offsetX < 8 && y + m.offsetY >= 0;
                    }
                    return x + m.offsetX < 8 && y + m.offsetY < 8;
                }
            }).count();

            System.out.println(movesCount);
        }

        scanner.close();
    }

    private static final Move[] moves = new Move[]{
            new Move(-2, -1),
            new Move(-2, 1),
            new Move(2, -1),
            new Move(2, 1),
            new Move(-1, -2),
            new Move(-1, 2),
            new Move(1, -2),
            new Move(1, 2),
    };

    private static class Move {
        int offsetX;
        int offsetY;

        public Move(int offsetX, int offsetY) {
            this.offsetX = offsetX;
            this.offsetY = offsetY;
        }
    }
}
