

import java.util.Arrays;
//************ arrays by default are pass by reference
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 30, 8, 5, 4, 20 };

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] bubbleSort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}
