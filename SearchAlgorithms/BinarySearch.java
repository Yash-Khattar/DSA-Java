public class BinarySearch {
    // ceiling
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 17;
        int index = ceil(arr, target);
        System.out.println(arr[index]);

    }
    static  int search(int[] arr, int target){

        int s = 0;
        int e = arr.length-1;
        int m = s+ (e-s) /2;;
        boolean isAsc = arr[s] < arr[e];

        while (s <= e){
            m = s+ (e-s) /2;
            if( target == arr[m]){
                return m;
            }
            if(isAsc){
                if( target < arr[m]){
                    e = m-1;
                }
                else{
                    s = m+1;
                }
            }
            else {
                if( target > arr[m]){
                    e = m-1;
                }
                else{
                    s = m+1;
                }
            }


        }
        return s; // return start = m+1
    }

    static int ceil(int[] arr, int target){
        int s=0;  
        int e = arr.length-1;
        int m = s+ (e-s)/2;
        while(s<=e){
            m = s+ (e-s)/2;
            if(target == arr[m]){
                return m;
            }
            if(target>m){
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        return m+1;
    }

}
// for floor return end = m -1

