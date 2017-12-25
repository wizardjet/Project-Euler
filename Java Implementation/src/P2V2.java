//Even Fibonacci numbers
public class P2V2 {

  private static final int THRESHOLD = 4000000;

  public static void main(String[] args) {

    int sum = 2;
    int[] fibArray2 = new int[3];
    fibArray2[0] = 1;
    fibArray2[1] = 2;

    do {

      fibArray2[2] = fibArray2[1] + fibArray2[0];
      fibArray2[0] = fibArray2[1];
      fibArray2[1] = fibArray2[2];

      if ((fibArray2[2] % 2 == 0) && (fibArray2[2] < THRESHOLD)) {
        sum += fibArray2[2];
      }
    }
    while (fibArray2[2] < THRESHOLD);
    System.out.println(sum);
  }
}
