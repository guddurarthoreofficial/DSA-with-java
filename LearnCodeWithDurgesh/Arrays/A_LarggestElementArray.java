public class A_LarggestElementArray {

    public int A_LarggestElement(int arr[]){
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        A_LarggestElementArray le = new A_LarggestElementArray();
        
        int arr[] = {1,3,25,7,6,53,4};
        System.out.println(le.A_LarggestElement(arr));
    }
    
}
