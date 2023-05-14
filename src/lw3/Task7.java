package lw3;

public class Task7 {
    public static void main(String[] args) {
        Node.createFromHead().print();
        Node.createFromTail().print();
    }
    
    private static class Node {
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public void print() {
            Node ref = this;
            while (ref != null) {
                System.out.print(ref.value + " ");
                ref = ref.next;
            }
            System.out.println();
        }

        private static Node createFromHead() {
            Node node0 = new Node(0, null);
            Node node1 = new Node(1, null);
            node0.next = node1;
            Node node2 = new Node(2, null);
            node1.next = node2;
            node2.next = new Node(3, null);
            return node0;
        }

        private static Node createFromTail() {
            Node head = null;
            for (int i = 3; i >= 0; i--) {
                head = new Node(i, head);
            }
            return head;
        }
    }
}
