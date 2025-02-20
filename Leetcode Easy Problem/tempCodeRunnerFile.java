class Problem01TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i,j };
                }
            }

        }
        // throw new IllegalArgumentException("No two sum solution"); // Add return for cases where no solution is found
        return null;

    }

    public static void main(String[] args) {
        Problem01TwoSum problem = new Problem01TwoSum();
        int[] nums = { 2, 4, 456, 7, 5 };
        int target = 6;
        int[] result = problem.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}