// package Stacks;


import java.util.Stack;
public class DisplayReverseRecursive {

    public static void displayRecursively(Stack<Integer> st) {
        int top = st.pop();
        // System.out.println(top);
        if (st.size() == 0) return;
        displayRecursively(st);
        System.out.print(top+" ");
        st.push(top);
        return;
    }
    

    public static void main(String[] args) {
        InsertAtButtom ib = new InsertAtButtom();
        Stack<Integer> st = new Stack<>();
        
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(12);

        System.out.println("original stack : " + st);
        displayRecursively(st);

    }
}
