package lw5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task6 {
    public static void main(String[] args) {
        int[] array = IntStream.range(0, 100_000_000).toArray();
        shuffleArray(array);

        int threadCount = Runtime.getRuntime().availableProcessors();
        int arrayStep = (int) Math.ceil(array.length / (double) threadCount);

        System.out.printf("Thread count: %d\n", threadCount);

        List<SumValuesThread> threads = IntStream.range(0, threadCount)
                .mapToObj(i -> new SumValuesThread(array, i * arrayStep, (i + 1) * arrayStep))
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
        int sumValues = threads.stream()
                .map(SumValuesThread::getSumValues)
                .mapToInt(i -> i)
                .sum();
        long endTime = System.currentTimeMillis();

        System.out.printf("Sum values: %d (%dms) \n", sumValues, endTime - startTime);
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

    private static class SumValuesThread extends Thread {
        private final int[] array;
        private int sumValues = 0;

        public SumValuesThread(int[] array, int from, int to) {
            super();
            this.array = Arrays.copyOfRange(array, from, to);
        }

        @Override
        public synchronized void run() {
            this.sumValues = Arrays.stream(array).sum();
            this.interrupt();
        }

        public int getSumValues() {
            return this.sumValues;
        }
    }
}
