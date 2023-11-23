package Recursion;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(countingzero(30204, 0));
    }
    public static int countingzero(int n, int c){
        if(n == 0){
            return c;
        }
        
        return  (n%10 == 0)? countingzero(n/10, ++c) : countingzero(n/10, c);
    }
}
