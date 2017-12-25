//10001st prime
public class P7V1benchmark {

  private static final int NUM = 10001;

  public static void main(String[] args) {

    long startTime = System.nanoTime();

    int numOfPrimes = 0;
    int i = 1;

    while (numOfPrimes < NUM) {
      if (isAPrimeNum(i)) {
        numOfPrimes++;
        //System.out.println(numOfPrimes + ": " + i + " is a prime number");
      }
      i++;
    }

    long stopTime = System.nanoTime();
    System.out.println("Time(ns): " + (stopTime - startTime));

  }

  public static boolean isAPrimeNum(int n) {
    if ((n == 1) || (n != 2 && n % 2 == 0)) {
      return false;
    }
    else if ((n == 2) || (n == 3) || (n == 5) || (n == 7)) {
      return true;
    }
    else {
      int sqrtOfN = ((int)Math.sqrt(n));
      for (int i = 3; i <= sqrtOfN; i++) {
        if (n % i == 0) {
          return false;
        }
      }
    }
    return true;
  }


}
