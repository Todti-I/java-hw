package hw6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = IntStream.range(0, 10).toArray();
        int[] array2 = IntStream.range(7, 15).toArray();
        int[] intersection = intersectArrays(array1, array2);
        System.out.println(Arrays.toString(intersection));
    }

    private static int[] intersectArrays(int[] array1, int[] array2) {
        return Arrays.stream(array1)
                .distinct()
                .filter(x -> Arrays.stream(array2).anyMatch(y -> x == y))
                .toArray();
    }
}
