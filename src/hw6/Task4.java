package hw6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = IntStream.range(0, 10).toArray();
        int[] squares = squareValues(numbers);
        System.out.println(Arrays.toString(squares));
    }

    private static int[] squareValues(int[] numbers) {
        return Arrays.stream(numbers)
                .map(n -> n * n)
                .toArray();
    }
}
