import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> reverseArray(int arr[]) {
        ArrayList<Integer> newArr = new ArrayList<>();

        // code here
        for (int i = arr.length-1; i >= 0; i--) {
            newArr.add(arr[i]);
        }

        return newArr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[] = { 1, 3, 25, 7, 67, 53, 4 };

        ArrayList<Integer> reversedArray = solution.reverseArray(arr);
        System.out.println(reversedArray);
    }

}