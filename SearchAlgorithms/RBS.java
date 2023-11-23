public class RBS {
    public static void main(String[] args) {
        int[] nums = {3,5,1};
        int target = 3;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {

        int pivot = findPivot(nums);
        if(pivot == -1){
            return    binarySearch(nums, target, pivot, 0, nums.length-1);
        }

        if(nums[pivot] == target){
            return pivot;
        }
        if(nums[0] <= target){
            return  binarySearch(nums, target, pivot, 0, pivot-1);
        }
        else{
            return  binarySearch(nums, target, pivot, pivot+1, nums.length-1);
        }
    }
    public static int findPivot(int[] nums){
        int start= 0;
        int end = nums.length -1;

        while(start<= end){
            int mid = start + (end - start)/2;
            if(mid<end && nums[mid]> nums[mid+1]){
                return mid;
            }
            if(mid> start && nums[mid]< nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<= nums[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] nums, int target, int pivot, int s, int e){

        while (s <= e){
            int  m = s+ (e-s) /2;
            if( target == nums[m]){
                return m;
            }
            if( target < nums[m]){
                e = m-1;
            }
            else{
                s = m+1;
            }
        }
        return  -1;
    }
}
