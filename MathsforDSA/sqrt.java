
public class sqrt {    
    public static void main(String[] args) {
         int n = 40;

   System.out.println(binarySearch(n));
    }

  static double binarySearch(int n){
    int s =1;
    int e = n;
    double root = 0.0;
    while(s<=e){
        int m= s + (e-s)/2;
        if( (m)*(m) == n ){
          return m;
        }
        if((m)*(m) > n){
          e = m-1;
        }
        else{
          s = m+1;
        }      


    }
System.out.println(root);
    double incr = 0.1;
    for (int i = 0; i < 3; i++) {
      System.out.println(root);
      while(root*root < n){
root += incr;
      }
      root -= incr;
      incr /= 10;
    }
    return root;
  }
}
