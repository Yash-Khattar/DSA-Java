package Recursion;

import java.util.Arrays;

public class BubbleSortRecursion {
    
    public static void main(String[] args) {
        int arr[] = { 1, 8, 4, 6, 2 };
        System.out.println(Arrays.toString(bubbleSort(arr, 5, 0)) );

    }
public static int[] bubbleSort(int arr[], int n, int i){

    if( n == 0){
        return arr;
    }
    if( i == n-1){
      return bubbleSort(arr, n-1, 0);
    }
     if( arr[i] < arr[i+1]){
        return bubbleSort(arr, n, i+1);
     }
     else{
        int temp = arr[i+1];
        arr[i+1] = arr[i];
        arr[i] = temp;
        return bubbleSort(arr, n, i+1);
     }
}
}
