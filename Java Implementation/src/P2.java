//Even Fibonacci numbers
public class P2 {

  private static final int THRESHOLD = 4000000;

  public static void main(String[] args) {

    int n;
    int sum;
    int[] fibArray = new int[THRESHOLD];

    n = 0;
    sum = 0;
    fibArray[0] = 1;
    fibArray[1] = 2;

    do {
      if (n < 2) {
        if (fibArray[n] % 2 == 0) {
          sum += fibArray[n];
        }
        System.out.println("Sequence " + n + " = " + fibArray[n] + ", sum = " + sum);
        n++;
      }
      else if (n >= 2) {
        fibArray[n] = (fibArray[(n-1)] + fibArray[(n-2)]);
        if ((fibArray[n] % 2 == 0) && (fibArray[n] <= THRESHOLD)) {
          sum += fibArray[n];
        }
        System.out.println("Sequence " + n + " = " + fibArray[n] + ", sum = " + sum);
        n++;
      }
    }
    while (fibArray[n-1] <= THRESHOLD);

    System.out.println("The sum of even values from the sequence is " + sum);
  }
}
