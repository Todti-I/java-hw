package lw5;

import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
        IntStream.range(0, 10).mapToObj(Task4::createThread).forEach(Thread::start);
    }

    private static Thread createThread(int i) {
        return new Thread(() -> System.out.printf("%s: %d\n", Thread.currentThread().getName(), i));
    }
}
