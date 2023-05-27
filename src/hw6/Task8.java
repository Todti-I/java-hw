package hw6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task8 {
    public static void main(String[] args) {
        int[] numbers = IntStream.range(0, 10).toArray();
        int numberOver = 5;
        int[] bigNumbers = filterMoreThan(numbers, numberOver);
        System.out.println(Arrays.toString(bigNumbers));
    }

    private static int[] filterMoreThan(int[] numbers, int numberOver) {
        return Arrays.stream(numbers)
                .filter(n -> n > numberOver)
                .toArray();
    }
}
