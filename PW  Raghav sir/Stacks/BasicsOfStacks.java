// package Stacks;

import java.util.*;
public class BasicsOfStacks {
    public static void main(String[] args) {

        // int [] aar = new int[4];

        Stack<Integer> st = new Stack<>();

        //size of stack
        System.out.println("Size of Stack: "+st.size());
        
        // add item to the top 
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        
        //size of stack
        System.out.println("Size of Stack: "+st.size());
        // print topmost elewment 
 
        int topMostItem = st.peek();
        System.out.println(topMostItem);

        // print Stack 
        System.out.println(st);
        // delete top item
        st.pop();

    }

}