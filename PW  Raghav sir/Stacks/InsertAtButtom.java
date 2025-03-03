// package Stacks;

import java.util.Stack;

public class InsertAtButtom {

    static Stack<Integer> insertData(int index,int data , Stack<Integer> st) {
        Stack<Integer> st2 = new Stack<>();

        while (st.size() > index) {
            st2.push(st.pop());
        }
        st.push(data);

        while (st2.size() > 0) {
            st.push(st2.pop());
        }
        return st;
    }
    

    public static void main(String[] args) {
        InsertAtButtom ib = new InsertAtButtom();
        Stack<Integer> st = new Stack<>();

        System.out.println("Size of Stack: " + st.size());
        // add item to the top

        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(12);

        System.out.println(ib.insertData(3,4321, st));

    }

}
