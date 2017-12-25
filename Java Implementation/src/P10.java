//Summation of primes
public class P10 {

  private static final long VALUE = 2000000;

  static int[] primeNumbers = new int[1000000];
  static int counter = 1;

  public static void main(String[] args) {

    long sumOfPrimes = 2;
    primeNumbers[0] = 2;

    for (int i = 3; i <= VALUE; i += 2) {
      if (isAPrimeNum(i)) {
        System.out.println("Prime number found: " + i);
        primeNumbers[counter] = i;
        counter++;
        sumOfPrimes += i;
      }
    }
    System.out.println(sumOfPrimes);
  }

  public static boolean isAPrimeNum(int n) {
    for (int i = 0; i < counter; i++) {
      if ((n % primeNumbers[i]) == 0) {
        return false;
      }
    }
    return true;
  }

}
//142913828922
