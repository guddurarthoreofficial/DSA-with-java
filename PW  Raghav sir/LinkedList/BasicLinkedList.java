// package LinkedList;

public class BasicLinkedList {

    public static class Node {
        int data; // value
        Node next; /// address

        Node(int data) {
            this.data = data;
        }

    }

    // print data
    public static void Display(Node head) {
        while (head != null) {
            System.out.print(head.data + " => ");
            head = head.next;
        }
    }

    // print data recursevely
    public static void DisplayRecusively(Node head) {
        System.out.println(head.data);
        if (head == null) return;
        DisplayRecusively(head.next);
     }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        //print data 
        DisplayRecusively(a);

        // Display(a);
        // System.out.println();








        // for (int i = 0; i < 4; i++){
        // System.out.println(head.data);
        // head = head.next;
        // }

        // Traverse and print the linked list
        // Node head = a;
        // while (head != null) {
        // System.out.print(head.data + " => ");
        // head = head.next;
        // }

        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);
        // System.out.println(a.next.next.next.next.next.data);

    }
}
