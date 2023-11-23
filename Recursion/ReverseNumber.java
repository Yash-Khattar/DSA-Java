package Recursion;
import java.math.*;
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseRecursion(1234));
    }
    
    static int reverseIteration(int n){
        int rev =0;
        while(n !=0){
            int d = n%10;
            rev = rev*10 +d;
            n = n/10;
        }
        return rev;
    }
  static  int base =4;
    static int reverseRecursion(int n){
     
    if(n/10 ==0 ){
        return n;
    }
    --base;
    return (int) ((n%10)*Math.pow(10, base) + reverseRecursion(n/10));
    }
}
