// package Stacks;

import java.util.*; 
public class MoveStackInsameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        // +++============ user input +++==============
        // int n; 
        // System.out.println("Enter the number of item that u want to push: ");
        // n = sc.nextInt();

        // for(int i = 0; i < n; i++){
        //     System.out.println("Enter the "+i+" st Elemnt: ");
        //     int item = sc.nextInt();
        //     st.push(item);
        // }


        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);


        // print stack- 1
        System.out.println(st);


        // =========== Reverse Stack ==================
        Stack<Integer> st2= new Stack<>();

        while (st.size() > 0) {
            // st2.push(st.peek());
            // st.pop();

            st2.push(st.peek());

        }
        
        System.out.println(st2);
        System.out.println(st);


        // print stack in same Order 
        Stack<Integer> st3 = new Stack<>();
        while (st2.size() > 0) {
            // st3.push(st2.peek());
            // st2.pop();
            st3.push(st2.pop());
        }

        System.out.println(st3);


    }
}
