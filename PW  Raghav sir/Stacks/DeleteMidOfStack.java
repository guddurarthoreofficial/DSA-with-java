import java.util.Stack;

public class DeleteMidOfStack {
    public static void deleteMid(Stack<Integer> st) {
        // code here
        // if(st.size() == 0) return;
        // if(st.size()/2 )
        // int top = st.pop();
        // System.out.print(top + " ");
        // deleteMid(st);
        // return;
        
        
    }
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original stack: "+st);
        deleteMid(st);
    }
}
