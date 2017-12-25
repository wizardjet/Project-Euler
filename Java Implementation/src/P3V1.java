//Largest prime factor
public class P3V1 {

  private static final int VALUE = 13195;

  static int[] primeNumbers = new int[VALUE];
  static int[] primeFactors = new int[50];
  static int counter1 = 1;
  static int counter2 = 0;

  public static void main(String[] args) {

    primeNumbers[0] = 2;

    for (int i = 3; i < VALUE; i++) {
      if (isAPrimeNum(i)) {
        addToArray(i);
      }
    }
  //  for (int i = 0; i < counter1; i++) {
    //  if (VALUE % primeNumbers[i] == 0) {
    //    addToArray2(i);
    //  }
  //  }
  //  for a(int i = 0; i < counter2; i++) {
  //      System.out.println(primeFactors[i]);
  //  }

  }

  public static boolean isAPrimeNum(int n) {
    for (int i = 0; i < counter1; i++) {
      System.out.println(i);
      System.out.println("array: " + primeNumbers[i]);
      if ((n % primeNumbers[i]) == 0) {
        return false;
      }
    }
    return true;
  }

  public static void addToArray(int n) {
    for (int i = 0; i < VALUE; i++) {
      if (primeNumbers[i] == 0) {
        primeNumbers[i] = n;
        counter1++;
        break;
      }
    }
  }

  public static void addToArray2(int n) {
    for (int i = 0; i < VALUE; i++) {
      if (primeFactors[i] == 0) {
        primeFactors[i] = n;
        counter2++;
        break;
      }
    }
  }

  //first, is a prime number
  //check if value is divisible by prime number




}
