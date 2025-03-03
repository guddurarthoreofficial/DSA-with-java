// package Stacks;

import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println("Size of Stack: "+st.size());
        // add item to the top 
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        

        System.out.println(st);
        Stack<Integer> st2 =new Stack<>();
        while (st.size() > 0) {
            st2.push(st.peek());
            System.out.print(st.pop());
        }
        System.out.println(st2);


        // again copying to the next stack
        while (st2.size() > 0) {
            int x = st2.pop();
            st.push(x);
            System.out.print(x+ " ");
        }


    }
    
}
