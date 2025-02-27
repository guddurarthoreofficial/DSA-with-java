import java.util.Arrays;

public class A_ReverseArray {

    // ============ method -1 ===============

    // public int [] reverseArray(int[] arr){
    // int [] newArr = new int[arr.length];
    // for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
    // newArr[j] = arr[i];
    // }
    // return newArr;
    // }



    
    // ============ method -2 ===============

    public int[] reverseArray(int[] arr) {
        
        int start = 0;
        int end =arr.length-1;

        while (start < end) {
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;

            start ++;
            end --;
            
        }
        return arr;
    }

    

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 6, 8, 2, 9 };

        A_ReverseArray rs = new A_ReverseArray();

        System.out.println(Arrays.toString(rs.reverseArray(arr)));
    }
}