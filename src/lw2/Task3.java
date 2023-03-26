package lw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();

        System.out.print("Введите ключ: ");
        int key = in.nextInt();
        in.nextLine();

        String encodedText = encodeText(text, key);
        System.out.printf("Текст после преобразования: %s\n\n", encodedText);

        System.out.print("Выполнить обратное преобразование? (y/n) ");
        String answer = in.nextLine();

        if (answer.equals("y")) {
            System.out.println(decodeText(encodedText, key));
        } else if (answer.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }

        in.close();
    }

    private static String encodeText(String text, int key) {
        StringBuilder encodedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            encodedText.append((char) (text.charAt(i) + key));
        }
        return encodedText.toString();
    }

    private static String decodeText(String encodedText, int key) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < encodedText.length(); i++) {
            text.append((char) (encodedText.charAt(i) - key));
        }
        return text.toString();
    }
}
