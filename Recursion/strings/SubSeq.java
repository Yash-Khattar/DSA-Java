package Recursion.strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        // subseq("", "abc");
       System.out.println(subseArrayList("", "abc"));
    }
    public static void subseq(String p, String up){
    if( up.isEmpty()){
        System.out.println(p);
        return;
    }
    char ch = up.charAt(0);
    subseq( p+ch, up.substring(1));
    subseq(p, up.substring(1));

    }

    public static ArrayList<String> subseArrayList(String p, String up){
        if(up.isEmpty()){
ArrayList<String> ans = new ArrayList<>();
ans.add(p); 
return ans;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseArrayList(p + ch, up.substring(1));
                ArrayList<String> right = subseArrayList(p, up.substring(1));

                left.addAll(right);
                return left;
    }
}
