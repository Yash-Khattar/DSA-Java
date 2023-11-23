public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,5,9,2,6,0};
        int target = 2;
        System.out.println(search(arr, target));
    }
    static boolean search(int[] arr, int target){
        for (int j : arr) {
            if (target == j) {
                return true;
            }
        }
        return false;
    }
}
