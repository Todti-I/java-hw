package lw3.task8;

import java.util.Scanner;

public class MyLinkedList {
    private static final Scanner in = new Scanner(System.in);
    private Node head;

    public static MyLinkedList createHead() {
        System.out.print("Введите количество элементов: ");
        int count = in.nextInt();
        MyLinkedList list = new MyLinkedList();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите элемент: ");
            int value = in.nextInt();
            list.addLast(value);
        }
        return list;
    }

    public static MyLinkedList createTail() {
        System.out.print("Введите количество элементов: ");
        int count = in.nextInt();
        MyLinkedList list = new MyLinkedList();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите элемент: ");
            int value = in.nextInt();
            list.addFirst(value);
        }
        return list;
    }

    public static MyLinkedList createHeadRec() {
        System.out.print("Введите количество элементов: ");
        int count = in.nextInt();
        MyLinkedList list = new MyLinkedList();
        return createHeadRec(list, count);
    }

    private static MyLinkedList createHeadRec(MyLinkedList list, int count) {
        if (count > 0) {
            System.out.print("Введите элемент: ");
            int value = in.nextInt();
            list.addLast(value);
            return createHeadRec(list, count - 1);
        }
        return list;
    }

    public static MyLinkedList createTailRec() {
        System.out.print("Введите количество элементов: ");
        int count = in.nextInt();
        MyLinkedList list = new MyLinkedList();
        return createTailRec(list, count);
    }

    private static MyLinkedList createTailRec(MyLinkedList list, int count) {
        if (count > 0) {
            System.out.print("Введите элемент: ");
            int value = in.nextInt();
            list.addFirst(value);
            return createTailRec(list, count - 1);
        }
        return list;
    }

    @Override
    public String toString() {
        Node ref = head;
        StringBuilder result = new StringBuilder();
        while (ref != null) {
            result.append(ref.value).append(" ");
            ref = ref.next;
        }
        return result.toString();
    }

    public String toStringRec() {
        return toStringRec(head);
    }

    private String toStringRec(Node current) {
        if (current != null) {
            return current.value + " " + toStringRec(current.next);
        }
        return "";
    }

    public void addFirst(int value) {
        this.head = new Node(value, head);
    }

    public void addLast(int value) {
        if (head == null) {
            addFirst(value);
            return;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = new Node(value);
    }

    public void insert(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }

        Node current = head;
        Node previous;
        int count = 0;

        while (current != null) {
            previous = current;
            current = current.next;
            count++;
            if (index == count) {
                previous.next = new Node(value, current);
                return;
            }
        }

        throw new IndexOutOfBoundsException();
    }

    public void removeFirst() {
        head = head.next;
    }

    public void removeLast() {
        Node tail = head;
        while (tail.next.next != null) {
            tail = tail.next;
        }
        tail.next = null;
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }

        Node current = head;
        Node previous;
        int count = 0;

        while (current != null) {
            previous = current;
            current = current.next;
            count++;
            if (index == count) {
                previous.next = current.next;
                return;
            }
        }

        throw new IndexOutOfBoundsException();
    }
}
