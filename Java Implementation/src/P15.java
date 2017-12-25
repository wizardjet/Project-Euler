import java.math.BigInteger;
public class P15 {

  public static void main(String[] args) {
    BigInteger val1 = new BigInteger(factorial(40));
    BigInteger val2 = new BigInteger(factorial(20));
    BigInteger answer = val1.divide(val2.multiply(val2));
    System.out.println(answer);
  }

  public static String factorial(int n) {
    BigInteger result = BigInteger.valueOf(1);
    for (int i = 1; i <= n; i++) {
      result = result.multiply(BigInteger.valueOf(i));
    }
    return result.toString();
  }

}
