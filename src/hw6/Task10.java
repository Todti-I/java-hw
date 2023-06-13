package hw6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task10 {
    public static void main(String[] args) {
        int[] numbers = IntStream.range(0, 10).toArray();
        int numberLess = 3;
        int[] bigNumbers = filterLessThan(numbers, numberLess);
        System.out.println(Arrays.toString(bigNumbers));
    }

    private static int[] filterLessThan(int[] numbers, int numberLess) {
        return Arrays.stream(numbers)
                .filter(n -> n < numberLess)
                .toArray();
    }
}
