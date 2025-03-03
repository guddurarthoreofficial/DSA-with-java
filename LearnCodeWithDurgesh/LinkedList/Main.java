public class Main {
    public static void main(String[] args) {
        // Node node1= new Node(111);
        // System.out.println(node1.data);
        // System.out.println(node1.next);


        // Node node2 = new Node(22);
        // Node node3 = new Node(333);

        // System.out.println(node2.data);

        // node1.next = node2;
        // node2.next = node3;

        // System.out.println(node1.next.data);
        // System.out.println(node1.next.data);



        // int x = 45;

        // copy 
        // int y = x;

        // y = 30;

        // System.out.println(x);
        // System.out.println(y);

        Node node1 = new Node(32);
        Node node2 = node1;
        System.out.println(node1.data);
        System.out.println(node2.data);

        node2.data = 55;
        System.out.println(node1.data);
        System.out.println(node2.data);


    }
    
}
