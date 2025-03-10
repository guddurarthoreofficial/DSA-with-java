// package Recurtion;

public class SumOf_1_to_n {
    public static int findSum(int n) {
        int sum = 1;
        if (n == 1 || n == 0) return sum;
        sum = n + findSum(n - 1); 
        // System.out.print(sum+" ");
        return sum;
    }

    public static void main(String[] args) {
        // 1 + 2 + 3
        findSum(4);
        System.out.println(findSum(4));
    }

}
