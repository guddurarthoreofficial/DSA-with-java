package PW_Raghav_sir.Recurtion;
// package Recurtion;

public class FactorialOfNuber {
    static int fact(int n){
        if (n == 0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int x = 4;
        System.out.println("Factorial of a number is: "+fact(x));
    }
}
