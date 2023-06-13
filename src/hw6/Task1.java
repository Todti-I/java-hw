package hw6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = IntStream.range(0, 10).toArray();
        int[] evenNumbers = filterEvenNumbers(numbers);
        System.out.println(Arrays.toString(evenNumbers));
    }

    private static int[] filterEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();
    }
}
