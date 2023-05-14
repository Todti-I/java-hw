package lw4;

public class Example8 {
    public static void main(String[] args) {
        try {
            System.out.println(execute());
        } catch (RuntimeException e) {
            System.out.println("2");
        }
    }

    private static int execute() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }
}
