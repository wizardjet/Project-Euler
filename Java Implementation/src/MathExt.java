/**
 * Collection of methods to help with mathematical calculations.
 */
 public class MathExt {

    /**
     * Returns true if an integer is a prime number.
     * 
     * @param n the integer to check.
     * @return true if n is prime.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        int sqrt = (int) Math.sqrt(n) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (n % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }

 }