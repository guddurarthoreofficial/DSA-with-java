public class FindMiddleofLL {

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node middleNode(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        FindMiddleofLL fl = new FindMiddleofLL();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(fl.middleNode(a).data);
    }
}
