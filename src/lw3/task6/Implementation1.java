package lw3.task6;

import java.util.ArrayList;
import java.util.Iterator;

public class Implementation1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(i);
        }

        int count = 0;
        long start = System.currentTimeMillis();

        Iterator<Integer> iterator = arrayList.iterator();
        while (arrayList.size() > 1) {
            if (iterator.hasNext()) {
                iterator.next();
                if (count % 2 == 1) {
                    iterator.remove();
                }
                count++;
            } else {
                iterator = arrayList.iterator();
            }
        }

        System.out.printf("Время выполнения: %d ms \n", System.currentTimeMillis() - start);
    }
}
