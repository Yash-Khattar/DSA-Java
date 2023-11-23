import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    static int[] reverse(int[] arr){
       int  n = arr.length-1;
       int[] reversedArray = new  int[arr.length];
        for (int j : arr) {
            reversedArray[n] = j;
            n--;
        }
       return reversedArray;
    }
}
