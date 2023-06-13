package hw6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abcde", "bcdef", "cdefg", "defgh");
        String substring = "bcd";
        List<String> stringsWithFirstUppercase = filterWithSubstring(strings, substring);
        System.out.println(stringsWithFirstUppercase);
    }

    private static List<String> filterWithSubstring(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
