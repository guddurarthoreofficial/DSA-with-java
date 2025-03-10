// package Recurtion;

public class A_To_Power_B {
    // itrative
     static int calPow(int a , int b){

        int power = 1;
        for(int i = 0; i < b; i++ ){
            power = power*a;
            System.out.println(power);
        }
        return power;
        
    }

    int calPowRec(int a, int b){
        int result = 1;
        if(b == 1){
            return result;
        }
        result = result * calPow(a, b-1);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(calPow(2,5));
    }
}
