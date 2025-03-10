package PW_Raghav_sir.Recurtion;
// package Recurtion;

public class Decreasing {

    public static void greet(int n){
        if(n == 0) return;
        System.out.println("Welcome Guddu");
        greet(n-1);
    }
    public static void main(String[] args) {
        greet(4);
    }
}
