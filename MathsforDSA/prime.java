


public class prime {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        // by defalut myArray = false = all elemnents are prime
        // true = non prime

        isPrime(n, primes);
    }

    public static void isPrime(int n, boolean[] primes) {

        for (int i = 2; i * i <= n; i++) {

            if (!primes[i]) {
                for (int j = i * 2; j <= n; j = j + i) {

                    primes[j] = true;

                }
            }

        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.println(i);
            }
        }

    }
}