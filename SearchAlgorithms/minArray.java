public class minArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,2};
        System.out.println(min(arr));
    }
    static  int min(int[] arr){
        int min = arr[0];
        for (int e: arr) {
            if(e< min){
                min = e;
            }

        }
        return min;
    }
}
