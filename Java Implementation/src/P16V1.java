import java.math.BigInteger;
public class P16V1 {
  private static final int POWER = 1000;
  public static void main(String[] args) {
    String largeNum = BigInteger.valueOf(2).pow(POWER).toString();
    long sum = 0;
    for (int i = 0; i < largeNum.length(); i++) {
      sum += Character.getNumericValue(largeNum.charAt(i));
    }
    System.out.println("Final sum is: " + sum);
  }
}
