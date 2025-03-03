// package Stacks;


import java.util.Stack;
public class DisplayReverseRecursive {
    // package Stacks;


    public static Stack<Integer> displayRecursively(Stack<Integer> st) {
       
        if(st.size() == 0) return st;
        int data = st.pop();
        System.out.print(data +" ");
        displayRecursively(st);
        st.push(data);
        return st;
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
        System.out.println(displayRecursively(st));

    }
}
