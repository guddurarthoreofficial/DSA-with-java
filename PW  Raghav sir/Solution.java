class Solution {
    public static void plusOne(int[] arr) {
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            num = num*10;
            num += arr[i];
        }
  

        int number = num + 1 ;

        for (int i = arr.length - 1; i >0 ; i--){
             int digit = number%10;
            if(digit == 0){
                arr[i] = 10;
            }
            arr[i] = digit;
            number = number/10;
        }
        



        for (int  val : arr) {
            System.out.println(val);
        }

    

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,9};
        plusOne(arr);

    }
}