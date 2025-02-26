public class A_GetSecondLargest {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int largest, secLargest;
        if (arr[0] > arr[1]) {
            largest = arr[0];
            secLargest = arr[1];
        } else {
            largest = arr[1];
            secLargest = arr[0];
        }
    
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];      
                     
            }else if ( arr[i] > secLargest  && arr[i] != largest ) {
                secLargest = arr[i];
            }
        }
        return secLargest;
    }
    public static void main(String[] args) {

        int []arr = {1,2,12,4,56,87,8};
// 
        System.out.println(getSecondLargest(arr));
    }
    
}
