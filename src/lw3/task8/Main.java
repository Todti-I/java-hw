package lw3.task8;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(0);
        list.addFirst(0);
        list.addFirst(0);
        System.out.println("Начальный лист: " + list.toStringRec());
        list.insert(2, 1);
        list.insert(0, 2);
        list.insert(5, 3);
        list.addFirst(4);
        list.addLast(5);
        System.out.println("Лист после вставок: " + list);
        list.removeLast();
        list.removeFirst();
        list.remove(5);
        list.remove(0);
        list.remove(2);
        System.out.println("Лист после удалений: " + list);
    }
}
