package hw6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "ab", "abc", "abcd", "abcde");
        int lengthOver = 3;
        List<String> longStrings = filterByLength(strings, lengthOver);
        System.out.println(longStrings);
    }

    private static List<String> filterByLength(List<String> strings, int lengthOver) {
        return strings.stream()
                .filter(s -> s.length() > lengthOver)
                .collect(Collectors.toList());
    }
}
