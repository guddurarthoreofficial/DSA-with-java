// package Recurtion;

public class Print_1_To_N {
    static void printSec(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        printSec(n-1);
        return;
    }
    public static void main(String[] args) {
        printSec(5);
    }
}
