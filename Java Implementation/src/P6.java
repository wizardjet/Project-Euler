//Sum square difference
public class P6 {

  private static final int NUM = 100;

  public static void main(String[] args) {

    long n = 0;
    long sumOfSq = 0;
    long sqOfSum = 0;

    for (int i = 1; i <= NUM; i++) {
      sumOfSq += ((long)Math.pow(i,2));
      n += i;
    }
    sqOfSum = ((long)Math.pow(n,2));
    System.out.println("Square of sum: " + sqOfSum);
    System.out.println("Sum of squares: " + sumOfSq);
    System.out.println(Math.abs(sumOfSq - sqOfSum));
  }
}
