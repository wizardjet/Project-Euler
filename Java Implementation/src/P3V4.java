//Largest prime factor
public class P3V4 {

  private static final long VALUE = 600851475143L;

  public static void main(String[] args) {

    long startTime = System.currentTimeMillis();

    int primeFactor = 0;
    double sqVal = Math.sqrt((double)VALUE);
    double sqrt;

    for (int i = 3; i < sqVal; i += 2) {
      sqrt = Math.sqrt((double)i);
      if (isAPrimeNum(i, sqrt)) {
        //System.out.println("Prime number found: " + i);
        if (VALUE % i == 0) {
          //System.out.println("Prime factor found: " + i);
          if (i > primeFactor) {
            //System.out.println("Largest prime factor found: " + i);
            primeFactor = i;
          }
        }
      }
    }
    System.out.println("The largest prime factor is " + primeFactor);
    long finishTime = System.currentTimeMillis();
    long elapsedTime = finishTime - startTime;
    System.out.println("\n" + "Time(ns): " + elapsedTime);

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
