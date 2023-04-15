package lw3.task6;

import java.util.Iterator;
import java.util.LinkedList;

public class Implementation2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            linkedList.add(i);
        }

        int count = 0;
        long start = System.currentTimeMillis();

        Iterator<Integer> iterator = linkedList.iterator();
        while (linkedList.size() > 1) {
            if (iterator.hasNext()) {
                iterator.next();
                if (count % 2 == 1) {
                    iterator.remove();
                }
                count++;
            } else {
                iterator = linkedList.iterator();
            }
        }

        System.out.printf("Время выполнения: %d ms \n", System.currentTimeMillis() - start);
    }
}
