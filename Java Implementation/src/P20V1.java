import java.math.BigInteger;
public class P20V1 {

  private final static int NUM = 100;

  public static void main(String[] args) {

    BigInteger result = BigInteger.valueOf(1);

    for (int i = NUM; i > 0; i--) {
      result = result.multiply(BigInteger.valueOf(i));
    }

    String s = result.toString();
    int sum = 0;

    for (int i = 0; i < s.length(); i++) {
      sum += Character.getNumericValue(s.charAt(i));
    }

    System.out.println("Sum: " + sum);
  }
}
