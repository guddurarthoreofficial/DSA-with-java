
import java.util.LinkedList;
import  java.util.Collection;
import java.util.Collections;

class ArrayList{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<String> list1 = new LinkedList<String>();
        LinkedList<Boolean> list2 = new LinkedList<Boolean>();

        System.out.println(list);

        // add item 
        list.add(7);
        list.add(6);
        list.add(35);
        list.add(2);
        System.out.println(list);

        //get element from the list
        int ele0 = list.get(0);
        int ele1 = list.get(01);
        int ele2= list.get(02);
        int ele3= list.get(03);
        System.out.println(ele0);
        System.out.println(ele1);
        System.out.println(ele2);
        System.out.println(ele3);


        //addd item
        list.add(1,33333);
        System.out.println(list);

        //set elment
        list.set(2, 1133334);
        System.out.println(list);

        //delete
        list.remove(3);
        System.out.println(list);


        // size
        int sizeOfList = list.size();
        System.out.println(sizeOfList);     //4


        // traverse the list
        for(int i = 0; i < list.size(); i++){
            System.out.println("Item of list with Index+: "+i+": "+list.get(i));
        }


        // sort the list 
        Collections.sort(list);

        System.out.println("Sorted list: "+list);





        
    }
}














