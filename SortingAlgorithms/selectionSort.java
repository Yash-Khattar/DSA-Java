
import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {-1,7,-32};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    static int[] selectionSort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            int maxIndex = 0;
            for(int j = 1; j< arr.length -i; j++){
                if( arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }

            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;

        }
        return arr;
    }
}
