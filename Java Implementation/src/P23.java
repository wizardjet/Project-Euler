import java.util.*;
public class P23 {

  private static final int LIMIT = 28123;

  public static void main(String[] args) {

    int sum = 0;

    ArrayList<Integer> abundantNums = new ArrayList<Integer>();
    for (int i = 1; i <= LIMIT; i++) {
      if (sumOfDivisors(i) > i) {
        abundantNums.add(i);
        System.out.println("Abundant number " + i + " found");
      }
    }
    for (int j = 1; j <= LIMIT; j++) {
      if (!doesSumExist(j, abundantNums)) {
        System.out.println(j + " is a non-abundant sum");
        sum += j;
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
      if (al.contains(i) && al.contains((n-i))) {
        System.out.println(n + " is an abundant sum as the abundant numbers " + i + " and " + ((n-i)) + " exist");
        return true;
      }
    }
    return false;
  }

}
