public class StringSearch {
    public static void main(String[] args) {
        String str = "yash";
        char c = 'h';
        System.out.println(search(str,c));
    }
    static boolean search(String str, char c){
        for (int i : str.toCharArray()) {
            if(c== i){
                return true;
            }
        }
        return false;
    }
}
