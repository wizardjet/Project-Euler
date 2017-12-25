//Summation of primes
public class P10V1 {

  private static final long VALUE = 2000000;

  public static void main(String[] args) {

    long sumOfPrimes = 2;
    double sqrt;

    for (int i = 3; i < VALUE; i += 2) {
      sqrt = Math.sqrt((double)i);
      if (isAPrimeNum(i, sqrt)) {
        //System.out.println("Prime number found: " + i);
        sumOfPrimes += i;
      }
    }
    System.out.println(sumOfPrimes);
  }

  public static boolean isAPrimeNum(int n, double sqrt) {
    for (int i = 2; i <= sqrt; i++) {
      if ((n % i) == 0) {
        return false;
      }
    }
    return true;
  }

}
//142913828922
