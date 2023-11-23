public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {1,8,5,4,2,0};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
