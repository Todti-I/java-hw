package lw5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task5 {
    public static void main(String[] args) {
        int[] array = IntStream.range(0, 100_000_000).toArray();
        shuffleArray(array);

        int threadCount = Runtime.getRuntime().availableProcessors();
        int arrayStep = (int) Math.ceil(array.length / (double) threadCount);

        System.out.printf("Thread count: %d\n", threadCount);

        List<MaxValueThread> threads = IntStream.range(0, threadCount)
                .mapToObj(i -> new MaxValueThread(array, i * arrayStep, (i + 1) * arrayStep))
                .collect(Collectors.toList());

        long startTime = System.currentTimeMillis();
        threads.forEach(Thread::start);
        threads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        OptionalInt maxValue = threads.stream()
                .map(MaxValueThread::getMaxValue)
                .filter(OptionalInt::isPresent)
                .map(OptionalInt::getAsInt)
                .mapToInt(i -> i)
                .max();
        long endTime = System.currentTimeMillis();

        System.out.printf("Max value: %d (%dms) \n", maxValue.orElseThrow(), endTime - startTime);
    }

    private static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = random.nextInt(array.length);
            int t = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = t;
        }
    }

    private static class MaxValueThread extends Thread {
        private final int[] array;
        private OptionalInt maxValue = OptionalInt.empty();

        public MaxValueThread(int[] array, int from, int to) {
            super();
            this.array = Arrays.copyOfRange(array, from, to);
        }

        @Override
        public synchronized void run() {
            this.maxValue = Arrays.stream(array).max();
            this.interrupt();
        }

        public OptionalInt getMaxValue() {
            return this.maxValue;
        }
    }
}
