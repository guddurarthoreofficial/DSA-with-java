// package LinkedList;

public class LinkedListImplementation {
    // Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null; // Initialize next to null
        }
    }

    // LinkedList class
    public static class LinkedList {
        Node head = null;
        Node tail = null;

        // Method to insert a node at the end of the list
        public void insertAtEnd(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp; // If the list is empty, set head to the new node
                tail = temp; // Set tail to the new node as well
            } else {
                tail.next = temp; // Link the last node to the new node
                tail = temp; // Update the tail to the new node
            }
        }

        // Method to find the Length of Linked List

        public int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            System.out.println("Length0 of Lingth: " + count);
            return count;
        }

        // Method to insert a node at the Start of the list
        public void insertAtStart(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp; // If the list is empty, set head to the new node
                tail = temp; // Set tail to the new node as well
            } else {
                temp.next = head; // Link the last node to the new node
                head = temp; // Update the tail to the new node
            }
        }

        // Method to insert a node at the any position of the list
        public void insertAt(int val, int index) {
            Node t = new Node(val);
            Node temp = head;

            for (int i = 0; i < index - 1; i++) {
                head = head.next;
            }

            if(index == size()){
                insertAtEnd(val);
                return;
            }
            if(index == 0){
                insertAtStart(val);
                return;
            }
            if(index < 0 || index > size()){
                System.out.println("input of index is wrong");
                return;
            }
            else{
                t.next = temp.next;
                temp.next = t;
            }

        }



        // Method to display the linked list
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // insert At end
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);

        // insert at Start
        ll.insertAtStart(2);

        // insert at Any Position
        ll.insertAt(100, 3);

        // Display the linked list
        ll.display(); // Output: 10 -> 20 -> 30 -> null

        // Display size
        ll.size();

    }
}