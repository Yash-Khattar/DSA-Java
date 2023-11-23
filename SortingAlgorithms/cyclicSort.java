import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(cyclicSort(new int[]{3,5,2,1,4})));
    }
    static int[] cyclicSort(int[] arr){
        int i = 0;
        while( i< arr.length-1){
            //correct condition/ better
            //int correct = arr[i]-1;
            //if(arr[i] != arr[correct]){
            //     swap()
            // }
            if(arr[i] == i+1){
                i++;
            }
            else{
                 int temp = arr[i];
                 arr[i] =   arr[arr[i]-1];
                 arr[temp-1] = temp;
            }
        }
        return arr;
    }
}
 