package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sum(1342));
    }
    static int sum(int n){
        // if(n ==0){
        //     return 0;
        // }

        if(n%10 == 0){
            return n;
        }
        return n%10 + sum(n/10);
     
    }
}
