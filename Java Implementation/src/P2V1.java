//Even Fibonacci numbers
public class P2V1 {

  private static final int THRESHOLD = 4000000;

  public static void main(String[] args) {

    int sum;
    int[] fibArray = new int[THRESHOLD];

    sum = 0;
    fibArray[0] = 1;
    fibArray[1] = 2;


    for (int n = 1; fibArray[n-1] <= THRESHOLD; n++) {
      if (n < 2) {
        if (fibArray[n] % 2 == 0) {
          sum += fibArray[n];
        }
        System.out.println("n = " + n + ", sum = " + sum);
      }
      else if (n >= 2) {
        fibArray[n] = (fibArray[(n-1)] + fibArray[(n-2)]);
        if (fibArray[n] % 2 == 0) {
          sum += fibArray[n];
        }
        System.out.println("n = " + n + ", sum = " + sum);
      }
    }
  }
}
