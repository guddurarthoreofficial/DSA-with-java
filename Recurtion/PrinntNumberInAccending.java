package PW_Raghav_sir.Recurtion;
// package Recurtion;

public class PrinntNumberInAccending {
    static void PrintAccending(int n){
        if(n == 0){
            return;
        }
        PrintAccending(n-1);
        System.out.print(n+" ");
        return;

    }
    public static void main(String[] args) {
        PrintAccending(5);
    }
}
