
public class gdc {
    public static void main(String[] args) {
        System.out.println(gcdCalculator(105, 224));
        System.out.println(lcm(2, 7));
    }

    static int gcdCalculator(int a , int b){

        if(a == 0){
            return b;
        }
        return gcdCalculator(b%a, a);
    }

    static int lcm(int a , int b){
        return (a*b)/ gcdCalculator(a, b);
    }
}
