import java.util.Scanner;
// 0 1 1 2 3 5 8...
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int s =0;
            for (int i = 0; i <= n-2; i++) {
                 s = a + b;
                 a = b;
                 b = s;
            }
            System.out.println(s);
        }
        }
}