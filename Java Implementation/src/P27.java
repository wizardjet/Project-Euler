public class P27 {

    public static void main(String[] args) {
        int highestN = -1;
        int highestProduct = 0;
        for (int a = -999; a <= 999; a++) {
            for (int b = -1000; b <= 1000; b++) {
                int n = 0;
                while((isPrime(calculate(a, b, n)))) {
                    n++;
                }
                if (n > highestN) {
                    highestN = n;
                    highestProduct = a * b;
                    System.out.println("a: " + a + "\nb: " + b + "\nprimes: " + n);
                }
            }
        }
        System.out.println(highestProduct);
    }

    private static int calculate(int a, int b, int n) {
        return (int) (Math.pow(n, 2) + (a * n) + b);
    }

    private static boolean isPrime(int number) {
        if (number < 1) return false;
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }

}