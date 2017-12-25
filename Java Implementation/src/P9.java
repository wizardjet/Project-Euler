//Special Pythagorean triplet
public class P9 {

  public static void main(String[] args) {

    boolean flag = true;
    for (int x = 1; x < 1000; x++) {
      for (int y = 1; y < 1000; y++) {
        for (int z = 1; z < 1000; z++) {
          if ((Math.pow(x,2) + Math.pow(y,2)) == (Math.pow(z,2))) {
            if ((x + y + z) == 1000) {
              System.out.println("x: " + x + " y: " + y + " z: " + z);
              System.out.println("Product: " + (x*y*z));
              break;
            }
          }
        }
      }
    }
  }
}
