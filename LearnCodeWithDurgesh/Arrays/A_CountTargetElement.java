public class A_CountTargetElement {

    public static int countTargetElement(int[] arr, int key ){
        int count = 0;
        for(int i = 0; i < arr.length; i++ ){
            if(key == arr[i]){
                count ++;
            }
        }

        return count; 
    }
    public static void main(String[] args) {

        int [] arr = {1,2,3,3,4,4,7,7,8,4};
        System.out.println(countTargetElement(arr,3));
        
    }
}
