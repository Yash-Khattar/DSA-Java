public class InfiniteArray {
    public static void main(String[] args) {
int[] arr = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20};
int target = 2;
System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr, int target){
        int s =0;
        int e = 1;
        while(
            target > arr[e]
        ){
           int newS = e+1;
            e =  e +(e-s +1)*2;
            s = newS;
        }
        return binarySearch(arr, target, s  , e);
    }



public static int binarySearch(int arr[], int target, int s, int e ){
    while(s<=e){
        int m = s+ (e-s)/2;
        if(target == arr[m]){
            return  arr[m];
        }
        else if( target > arr[m]){
            s = m+1;

        }
        else if( target < arr[m]){
            e = m-1;
        }

    }
    return arr[s];
}







}
    // public static int ans(int[] arr, int target){
    //     int start = 0;
    //     int end = 1;
    //     while (target > arr[end]){
    //     int  newStart= end+1;
    //         end= end + (end - start +1)*2;
    //         start = newStart;
    //         if(end > arr.length-1){
    //             end = arr.length-1;
    //         }
    //     }

    //     return binarySearch(target, arr, start,end);
    // }
    // public static int binarySearch(int target, int[] arr, int start, int end){
    //     while (start<=end){

    //         int mid = start + (end-start)/2;
    //         if(target< arr[mid]){
    //             end = mid-1;
    //         }
    //        else if(target> arr[mid]){
    //             start = mid+1;
    //         }
    //        else {
    //            return arr[mid];
    //         }
    //     }
    //     return -1;
    // }

