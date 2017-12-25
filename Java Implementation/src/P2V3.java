//Even Fibonacci numbers
public class P2V3 {

  private static final int THRESHOLD = 4000000;

  public static void main(String[] args) {

    int sum = 2;
    int x = 1;
    int y = 2;
    int z = 0;

    do {
      z = x + y;
      x = y;
      y = z;
      if ((z % 2 == 0) && (z < THRESHOLD)) {
        sum += z;
      }
    }
    while (z < THRESHOLD);
    System.out.println(sum);
  }
}
