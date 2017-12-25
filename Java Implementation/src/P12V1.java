//Highly divisible triangular number
public class P12V1 {

  public static void main(String[] args) {
    int count = 0;
    for (int i = 1; count < 500; i++) {
      if (i > 1) {
        incTriangleNum();
      }
      count = 0;
      for (int j = 1; j <= getTriNum(); j++) {
        if (getTriNum() % j == 0) {
          count++;
        }
      }
      System.out.println("Triangle number " + getTriNum() + " of sequence " + i + " has " + count + " divisors");
    }
    System.out.println("Triangle number " + getTriNum() + " has " + count + " divisors");
  }

  static int i = 1;
  static int num = 1;

  public static void incTriangleNum() {
    i++;
    num += i;
  }

  public static int getTriNum() {
    return num;
  }


}
