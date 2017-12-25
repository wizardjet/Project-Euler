//Smallest multiple
public class P5 {

  public static void main(String[] args) {
    int a = 0;
    for (int i = 1; i <= 100000000000L; i++) {
      for (int j = 1; j <= 20; j++) {
        a = i % j;
        if (a != 0) {
            break;
        }
        if (j == 20) {
          System.out.println(i);
          System.exit(0);
        }
      }
    }
  }
}
