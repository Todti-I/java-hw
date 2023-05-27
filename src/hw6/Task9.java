package hw6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a1", "ab", "abc!", "ab/cd", "abcde");
        List<String> literalStrings = filterOnlyLiteral(strings);
        System.out.println(literalStrings);
    }

    private static List<String> filterOnlyLiteral(List<String> strings) {
        return strings.stream()
                .filter(s -> s.chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());
    }
}
