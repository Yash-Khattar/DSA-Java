package Recursion;

public class IsArraySorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,5};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int arr[], int index){
        if(arr.length -1 == index){
            return true;
        }
        return isSorted(arr, index+1) && arr[index] < arr[index+1];
    } 
}
 