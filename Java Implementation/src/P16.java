import java.math.BigInteger;
public class P16 {

  private static final int POWER = 1000;

  public static void main(String[] args) {
    BigInteger largeNum = BigInteger.valueOf(2).pow(POWER);
    String temp = largeNum.toString();
    System.out.println(temp);
    long sum = 0;
    for (int i = 0; i < temp.length(); i++) {
      System.out.println("charAt: " + (temp.charAt(i) - '0'));
      System.out.println("valueOf: " + Integer.valueOf((temp.charAt(i) - '0')));
      sum += Integer.valueOf((temp.charAt(i) - '0'));
      System.out.println("Sum is: " + sum);
    }
    System.out.println("Final sum is: " + sum);
  }
}
