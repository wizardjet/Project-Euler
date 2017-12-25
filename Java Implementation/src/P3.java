//Largest prime factor
public class P3 {

  private static final long VALUE = 600851475143L;

  static int[] primeNumbers = new int[60085147];
  static int counter = 1;

  public static void main(String[] args) {

    primeNumbers[0] = 2;

    for (int i = 3; i < VALUE; i++) {
      if (i % 2 != 0) {
        if (i % 3 != 0) {
      if (isAPrimeNum(i)) {
        addToArray(i);
      }
    }
  }
  }
    for (int i = 0; i < counter; i++) {
      System.out.println(primeNumbers[i]);
    }
    for (int i = 0; i < counter; i++) {
      if (VALUE % primeNumbers[i] == 0) {
        System.out.println("Prime factor found: " + primeNumbers[i]);
      }
    }

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
    for (int i = counter; i < VALUE; i++) {
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
