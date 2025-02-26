public class A_MoveZeroToLast{

    public static void moveZeroes(int[] arr) {
        int n = arr.length;
       int temp[] = new int[n];
       int index = 0;
       
       for(int i = 0; i < n; i++){
           if(arr[i] != 0){
              temp[index]= arr[i];
               index ++;
           }
       }
       
       while(index < n){
           temp[index] = 0;
           index ++;
       }
       
       for(int i = 0; i < n; i++){
          arr[i] = temp[i];
       }

       // print array
       for(int val : arr){
        System.out.println(val);
       }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,0,7,8,0,1,5,};
        moveZeroes(arr);
    }
}
