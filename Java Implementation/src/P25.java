import java.math.BigInteger;
public class P25 {

  public static void main(String[] args) {

    BigInteger x = new BigInteger("1");
    BigInteger y = new BigInteger("1");
    BigInteger z = new BigInteger("0");

    int index = 2;

    do {
      index++;
      z = x.add(y);
      x = y;
      y = z;
      System.out.println("String length: " + z.toString().length());
      System.out.println("Index: " + index);
    }
    while (z.toString().length() < 1000);
  }
}
