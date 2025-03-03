public class LinkedList {

    Node head = null;

    // ======================== Insert at Beginning ===========================
    public void insertAtBegining(int item) {
        Node newNode = new Node(item);
        newNode.next = head; 
        head = newNode;
    }

    // ======================== Insert at End ===========================
    public void insertAtEnd(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            return; 
        }

        Node temp = head;
        while (temp.next != null) { 
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // ======================== Insert at Specific Position =======================
    public void insertAtPosition(int item, int position) {
        if (position < 0) { // Fix: Negative check
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(item);
        if (position == 0) { // Fix: Handling position 0
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int index = 0;

        while (temp != null && index < position - 1) { // Fix: Prevents null pointer access
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = temp.next; // Fix: Corrected linking
        temp.next = newNode;
    }

    // ======================== Print List ===========================
    public void printData() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
