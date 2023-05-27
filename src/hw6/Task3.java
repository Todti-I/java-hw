package hw6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Aaaa", "bBbb", "ccCc", "dddD", "Eeee");
        List<String> stringsWithFirstUppercase = filterWithFirstUppercase(strings);
        System.out.println(stringsWithFirstUppercase);
    }

    private static List<String> filterWithFirstUppercase(List<String> strings) {
        return strings.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
