public class A_SingleElementInSortedArray {
    public static int findOnce(int[] arr) {
        // Complete this function
        for (int i = 0; i < arr.length - 2; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }

        return arr[arr.length - 1];
    }
    public static void main(String[] args) {

        int arr[] = {1,1,2,2,3,3,4,5,5};

        System.out.println(findOnce(arr));
    }

}
