public class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {

        Node list1 = new Node(2);
        Node list2 = new Node(22);
        Node list3 = new Node(33);
        Node list4 = new Node(44);

        list1.next = list2;
        list2.next = list3;
        list3.next = list4; 

        System.out.println(list1.data);
        System.out.println(list1.next.data);
        System.out.println(list1.next.next.data);
        System.out.println(list1.next.next.next.data); 
    }
}
