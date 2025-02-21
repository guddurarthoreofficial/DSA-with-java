import java.util.*;
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        
        for( int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = {1,2,4,5,6};
        System.out.println(sol.findClosestElements(arr,4,5));
        
    }
}



