package lw4;

public class Example9 {
    public static void main(String[] args) {
        System.out.println(execute());
    }

    private static int execute() {
        try {
            System.out.println("0");
            return 55;
        } finally {
            System.out.println("1");
        }
    }
}
