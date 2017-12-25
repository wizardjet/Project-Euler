//Multiples of 3 and 5
public class P1 {

  private static final int NUM = 1000;

  public static void main(String[] args) {

    int x;
    int y;
    int sum;

    x = 3;
    y = 5;
    sum = 0;

    for (int i = 1; i < NUM; i++) {
      if (i % 3 == 0) {
        System.out.println(i + " is a multiple of 3");
        sum += i;
      }
      else if (i % 5 == 0) {
        System.out.println(i + " is a multiple of 5");
        sum += i;
      }

    }

    System.out.println(sum);
  }

}
