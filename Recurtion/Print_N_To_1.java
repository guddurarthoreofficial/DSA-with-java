// package Recurtion;

public class Print_N_To_1 {
    static void printSec(int x , int n){
        // 10 9 8 7 6 5 4 3 2 1 
        if (x > n) return;
        System.out.print(x +" ");
        printSec(x + 1, n );
    }
    public static void main(String[] args) {
        printSec(1, 10);
    }
}
