package Mathematics;

import java.math.BigInteger;

public class Factorial {

    static BigInteger fact(int n){

        if(n==0){
            return BigInteger.ONE;
        }
        System.out.println(n);
        return BigInteger.valueOf(n).multiply(fact(n-1));
    }

    public static void main(String[] args) {

        int n = 1277;
        System.out.println(fact(n));
    }
}
