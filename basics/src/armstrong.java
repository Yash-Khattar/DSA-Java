public class armstrong {

    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
        if(  armstrongNo(i)){
            System.out.print(i + " , ");
           
        }
        }

    }
    static boolean armstrongNo(int n){
        int a;
        int s= 0;
        int r = n;
        while (n>0){
            a = n%10;
            s = s + a*a*a;
            n= n/10;
        }
      return s==r;
    }
}
