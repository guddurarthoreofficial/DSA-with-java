public class RemoveNthNodeFromEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // ============== Brute force method to remove Nth node from end
    // ================
    Node removeNthNodeFromEnd(Node head, int index) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        Node temp = head;
        int length = 0;

        // Count total nodes in the linked list
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Check if index is out of bounds
        if (index > length) {
            System.out.println("Index out of range.");
            return head;
        }

        // If we need to remove the first node (head)
        if (index == length) {
            return head.next;
        }

        // Find the node just before the target node
        int m = length - index; // 0-based index from start
        temp = head;
        for (int i = 1; i < m; i++) {
            temp = temp.next;
        }

        // Remove the Nth node from end
        temp.next = temp.next.next;

        return head;
    }

    // ============== Brute force method to remove Nth node from end  ==============

    Node removeNthfromEnd(Node head, int index) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        Node fast  = head;
        Node slow  = head;
        
        for (int i = 0; i < index; i++){
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }

    // Print linked list
    void printData(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEnd ll = new RemoveNthNodeFromEnd();

        // Creating linked list: 100 -> 200 -> 300 -> 400 -> 500 -> 600
        Node head = new Node(100);
        head.next = new Node(200);
        head.next.next = new Node(300);
        head.next.next.next = new Node(400);
        head.next.next.next.next = new Node(500);
        head.next.next.next.next.next = new Node(600);

        System.out.println("Original List:");
        ll.printData(head);

        int index = 2; // Remove the 6th node from the end
        head = ll.removeNthNodeFromEnd(head, index);

        System.out.println("\n==================== After =========================");
        ll.printData(head);

        System.out.println("======== optimised Method ============");
        ll.removeNthfromEnd(head,2);

        ll.printData(head);
    }
}
