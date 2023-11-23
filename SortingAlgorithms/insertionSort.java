

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,1,3,20,4};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    static int[] insertionSort(int[] arr){
        for(int i =0; i<= arr.length-2; i++){
            for( int j = i+1; j>0; j--){
                if(arr[j] < arr[j-1] ){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }

        }
        return arr;
    }
    
}
