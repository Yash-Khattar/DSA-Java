package Recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,19};
     System.out.println(search(arr, 19, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e){
        int m = s + (e-s)/2;
        if(target >arr[m]){
            s = m+1;
        }else if(target < arr[m]){
            e = m-1;
        }
        else if(target == arr[m]){
            return m;
        }
        else if( s>e){
            return -1;
        }
        return search(arr, target, s, e);
    }
}
