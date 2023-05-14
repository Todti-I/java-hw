package lw4;

public class Example10 {
    public static void main(String[] args) {
        System.out.println(execute());
    }

    public static int execute() {
        try {
            System.out.println("0");
            return 15;
        } finally {
            System.out.println("1");
        }
    }
}
