package lw3;

import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        exploreUpdateOperations(10_000);
        exploreReadOperations(10_000);
    }

    private static void exploreUpdateOperations(int count) {
        Random random = new Random(2);
        long startTime;
        int i;

        ArrayList<Integer> arrayList = new ArrayList<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (i = 0; i < 2_000_000; i++) {
            int value = random.nextInt(2_000_000);
            arrayList.add(value);
            sortedSet.add(value);
            linkedList.add(value);
        }


        //region ArrayList
        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            arrayList.add(0, 0);
        }
        System.out.printf("[ArrayList] Добавление в начало = %d ms\n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            arrayList.add(0);
        }
        System.out.printf("[ArrayList] Добавление в конец = %d ms\n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            arrayList.add(1_000_000, 0);
        }
        System.out.printf("[ArrayList] Добавление в середину = %d ms\n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            arrayList.remove(0);
        }
        System.out.printf("[ArrayList] Удаление в начале = %d ms\n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            arrayList.remove(1_999_999);
        }
        System.out.printf("[ArrayList] Удаление в конце = %d ms\n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            arrayList.remove(1_000_000);
        }
        System.out.printf("[ArrayList] Удаление из середины = %d ms\n", System.currentTimeMillis() - startTime);
        //endregion

        System.out.println();

        //region SortedSet
        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            sortedSet.add(0);
        }
        System.out.printf("[SortedSet] Добавление в начало = %d ms\n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            sortedSet.add(2_000_000);
        }
        System.out.printf("[SortedSet] Добавление в конец = %d ms\n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            sortedSet.add(1_000_000);
        }
        System.out.printf("[SortedSet] Добавление в середину = %d ms\n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            sortedSet.remove(0);
        }
        System.out.printf("[SortedSet] Удаление в начале = %d ms\n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            sortedSet.remove(2_000_000);
        }
        System.out.printf("[SortedSet] Удаление в конце = %d ms\n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            sortedSet.remove(1_000_000);
        }
        System.out.printf("[SortedSet] Удаление из середины = %d ms\n", System.currentTimeMillis() - startTime);
        //endregion

        System.out.println();

        //region LinkedList
        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            linkedList.addFirst(0);
        }
        System.out.printf("[LinkedList] Добавление в начало = %d ms \n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            linkedList.addLast(0);
        }
        System.out.printf("[LinkedList] Добавление в конец = %d ms \n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            linkedList.add(1_000_000, 0);
        }
        System.out.printf("[LinkedList] Добавление в середину = %d ms \n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            linkedList.removeFirst();
        }
        System.out.printf("[LinkedList] Удаление в начале = %d ms \n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            linkedList.removeLast();
        }
        System.out.printf("[LinkedList] Удаление в конце = %d ms \n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            linkedList.remove(1_000_000);
        }
        System.out.printf("[LinkedList] Удаление из середины = %d ms \n", System.currentTimeMillis() - startTime);
        //endregion

        System.out.println();
    }

    private static void exploreReadOperations(int count) {
        Random random = new Random(2);
        long startTime;
        int i;

        ArrayList<Integer> arrayList = new ArrayList<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (i = 0; i < 20_000_000; i++) {
            int value = random.nextInt();
            arrayList.add(value);
            sortedSet.add(value);
            linkedList.add(value);
        }


        //region ArrayList
        random = new Random(2);
        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            arrayList.get(random.nextInt(20_000_000));
        }
        System.out.printf("[ArrayList] Получение по индексу = %d ms\n", System.currentTimeMillis() - startTime);
        //endregion

        System.out.println();

        //region SortedSet
        random = new Random(2);
        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            sortedSet.contains(random.nextInt(20_000_000));
        }
        System.out.printf("[SortedSet] Получение по индексу = %d ms\n", System.currentTimeMillis() - startTime);

        //endregion

        System.out.println();

        //region LinkedList
        random = new Random(2);
        startTime = System.currentTimeMillis();
        for (i = 0; i < count; i++) {
            linkedList.get(random.nextInt(20_000_000));
        }
        System.out.printf("[LinkedList] Получение по индексу = %d ms \n", System.currentTimeMillis() - startTime);
        //endregion

        System.out.println();
    }

}