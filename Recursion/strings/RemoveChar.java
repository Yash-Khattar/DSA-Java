package Recursion.strings;

public class RemoveChar {
    public static void main(String[] args) {
        System.out.println(remove("baccab"));
    }

    public static String remove(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.charAt(0) == 'a'){
          return "" + remove(str.substring(1));
        }
        else{
             return str.charAt(0) + remove(str.substring(1));
        }
    }
}
