import java.util.Stack;

public  class CloneStack {

    static void  clonestack(Stack<Integer> st, Stack<Integer> cloned) {
        // code here
        Stack<Integer> temp = new Stack<>();
        while(st.size() > 0){
            temp.push(st.pop());
        }
        // System.out.println(temp);
        
        while(temp.size() > 0){
            cloned.push(temp.pop());
        }
        
        // System.out.println(cloned);

    }

    public static void main(String[] args) {
        CloneStack cs = new CloneStack();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> cloned = new Stack<>();
        // cloned.push(0);
    
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        clonestack(st ,cloned);

    }
}
