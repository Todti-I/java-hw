package lw8.task4;

public class Task4 {
    public static void main(String[] args) {
        LinkParser linkParser = new LinkParser("https://itlearn.ru/first-steps");
        linkParser.saveToFile("src/lw8/task4/example.txt");
    }
}
