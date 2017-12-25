//10001st prime
public class P7 {

  private static final long VALUE = 600851475143L;

  static int[] primeNumbers = new int[60085147];
  static int counter = 1;

  public static void main(String[] args) {

    primeNumbers[0] = 2;

    for (int i = 3; counter <= 10001; i++) {
      if (isAPrimeNum(i)) {
        System.out.println("Prime number found: " + i);
        addToArray(i);
        if (counter == 10001) {
          System.out.println(i);
        }
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


}
