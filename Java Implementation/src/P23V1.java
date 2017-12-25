import java.util.*;
public class P23V1 {

  private static final int LIMIT = 28123;

  public static void main(String[] args) {

    int sum = 0;

    ArrayList<Integer> abundantNums = new ArrayList<Integer>();
    for (int i = 1; i <= LIMIT; i++) {
      if (sumOfDivisors(i) > i) {
        abundantNums.add(i);
        //System.out.println("Abundant number " + i + " found");
      }
      if (!doesSumExist(i, abundantNums)) {
        System.out.println(i + " is a non-abundant sum");
        sum += i;
      }
    }
    System.out.println("Sum: " + sum);
  }

  public static int sumOfDivisors(int n) {
    int result = 0;
    for (int i = 1; i <= (n/2); i++) {
      if (n % i == 0) {
        result += i;
      }
    }
    return result;
  }

  public static boolean doesSumExist(int n, ArrayList al) {
    for (int i = 1; i <= (n/2); i++) {
      if (al.contains(i) && al.contains(n-i)) {
        //System.out.println(n + " is an abundant sum as the abundant numbers " + i + " and " + ((n-i)) + " exist");
        return true;
      }
    }
    return false;
  }

}
