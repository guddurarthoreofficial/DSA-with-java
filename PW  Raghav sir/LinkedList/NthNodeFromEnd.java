public class NthNodeFromEnd {

    public static class Node {
        int data;

        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // brute force

    void nthNodeFromEnd(Node head, int index) {

        // 1 2 3 4 5 6 7

        Node temp = head;

        if (head == null) {
            System.out.println("list is blanks");
            return;
        }

        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Check if index is out of bounds
        if (index > length) {
            System.out.println("Index out of range.");
            return;
        }

        int m = length - index + 1; // 7 - 3+1 = 5 th from the begning

        temp = head;
        for (int i = 1; i < m; i++) {
            temp = temp.next;
        }

        System.out.println(temp.data);
    }

    // =============== optimized ============
    void nthNode2(Node head, int index) {

        Node slow = head;
        Node fast = head;

        for (int i = 0; i < index; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        System.out.println("Data is : " +slow.data);
    }

    public static void main(String[] args) {

        NthNodeFromEnd ll = new NthNodeFromEnd();

        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(300);
        Node d = new Node(400);
        Node e = new Node(500);
        Node f = new Node(600);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        ll.nthNodeFromEnd(a, 3);
        ll.nthNode2(a, 3);

    }

}
