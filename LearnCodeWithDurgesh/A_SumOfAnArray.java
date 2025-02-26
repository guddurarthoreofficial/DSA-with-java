public class A_SumOfAnArray {

    public static int sumOfAnArray(int [] arr){
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++){
            sum  += arr[i];
        }
        return sum;
    };
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(sumOfAnArray(arr));
        
    }
}
