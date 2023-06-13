package hw6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task6 {
    public static void main(String[] args) {
        int[] numbers = IntStream.range(0, 10).toArray();
        int divisor = 3;
        int[] multiples = filterMultiples(numbers, divisor);
        System.out.println(Arrays.toString(multiples));
    }

    private static int[] filterMultiples(int[] numbers, int divisor) {
        return Arrays.stream(numbers)
                .filter(n -> n % divisor == 0)
                .toArray();
    }
}
