package Recursion.strings;

import java.util.ArrayList;

public class PhoneNoProblem {
    public static void main(String[] args) {
      System.out.println(phonenoArrayList("", "123"));  
    }
    public static void phoneno(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit =  Integer.parseInt(up.substring(0, 1)) ;
        
        for(int i = (digit-1)*3; i< digit*3; i++){
         phoneno( p  + (char) ('a' + i), up.substring(1));
        }
    }


        public static ArrayList<String> phonenoArrayList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>(); 
            list.add(p);
            return list;
        }
        int digit =  Integer.parseInt(up.substring(0, 1)) ;
         ArrayList<String> list = new ArrayList<>(); 
        for(int i = (digit-1)*3; i< digit*3; i++){
             
      list.addAll(phonenoArrayList( p  + (char) ('a' + i), up.substring(1)));
        }
        return list;
    }
}
