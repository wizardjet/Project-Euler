//Highly divisible triangular number
public class P12 {

  public static void main(String[] args) {
    //if triangleNum divisible by n, count++, n++, count <= 500
    int count = 0;
    for (int i = 1; count < 500; i++) {
      count = 0;
      //System.out.println("Sequence " + i + " has triangle number " + triangleNum(i));
      for (int j = 1; j <= triangleNum(i); j++) {
        if (triangleNum(i) % j == 0) {
          count++;
        }
      }
      System.out.println("Triangle number " + triangleNum(i) + " of sequence " + i + " has " + count + " divisors");
    }

  }

  public static int triangleNum(int n) {
    int num = 0;
    for (int i = 1; i <= n; i++) {
      num += i;
    }
    return num;
  }

}
