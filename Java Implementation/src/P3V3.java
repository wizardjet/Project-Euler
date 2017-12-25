//Largest prime factor
public class P3V3 {

  public static long value = 600851475143L;
  private static final long value2 = 600851475143L;

  static int[] primeNumbers = new int[60085147];
  static int counter = 1;

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();

    primeNumbers[0] = 2;
    int k = 3;

  do {
    if (isAPrimeNum(k)) {
      addToArray(k);
      if ((value % k) == 0) {
        value = (value/k);
        System.out.println("Prime factor found: " + k);
      }
    }
    k += 2;
  }
  while (k < 10000);
  long finishTime = System.currentTimeMillis();
  long elapsedTime = finishTime - startTime;
  System.out.println("\n" + "Time(ns): " + elapsedTime);

  }

  public static boolean isAPrimeNum(int n) {
    for (int i = 0; i < counter; i++) {
      if ((n % primeNumbers[i]) == 0) {
        return false;
      }
    }
    return true;
  }

  public static void addToArray(int n) {
    for (int i = counter; i < value; i++) {
      if (primeNumbers[i] == 0) {
        primeNumbers[i] = n;
        counter++;
        break;
      }
    }
  }

  //first, is a prime number
  //check if value is divisible by prime number




}
