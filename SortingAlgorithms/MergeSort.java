import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {2,5,1,9,6,3,11};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int arr[]){
       
        if(arr.length == 1){
            return arr;
        }
         int m = arr.length/2; 

         int left[] = mergeSort(Arrays.copyOfRange(arr, 0, m));
         int right[] = mergeSort(Arrays.copyOfRange(arr, m, arr.length));
         
         return merge(left,  right);
    }

    public static int[] merge(int[] first, int[] second) {
     
        int i=0, j =0, k=0;
        int merge[] = new int[first.length + second.length];
        while (i<first.length && j< second.length) {
            if(first[i]<= second[j]){
                merge[k] = first[i];
                ++k;
                ++i;
            }
            else{
                merge[k] = second[j];
                ++k;
                ++j;
            }
        }

        while(i< first.length){
             merge[k] = first[i];
                ++k;
                ++i;
        }
           while(j< second.length){
             merge[k] = second[j];
                ++k;
                ++j;
        }

        return merge;
    }
}
