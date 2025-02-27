class Solution {
    public static void moveZeroes(int[] nums) {

        int n = nums.length;

        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if( nums[i] == 0){
                index ++;
            }
            else if (nums[i] != 0){
                nums[index] = nums[i] ;
                index ++;
            }
            
        }

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

    }

    public static void main(String[] args) {
        int nums[] = {1,2 ,0 ,3 ,5 ,0 , 4, 2};
        moveZeroes(nums);
    
        
        
    }
}