public class A_ArrayIsSortedOrNot {
    public static boolean arraySortedOrNot(int[] arr) {
        // code here
        boolean isSorted = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
            }
        }
        
        return isSorted;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,8};
      
        
    }
}
