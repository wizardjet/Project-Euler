public class P24 {

  static int count = 0;

  public static void main(String[] args) {
    permutation("0123");
  }

  public static void permutation(String str) {
    System.out.println("Restart");
    permutation("", str);
  }

  private static void permutation(String prefix, String str) {
    System.out.println("\nprefix: " + prefix);
    System.out.println("str: " + str);

    int n = str.length();
    if (n == 0) {
      count++;
      System.out.println(count + ": " + prefix);
      System.out.println();
      if (count == 1000000) {
        System.out.println("The millionth lexicograpic permutation is " + prefix);
      }
    }
    else {
      for (int i = 0; i < n; i++) {
          System.out.println("hence str becomes " + str.substring(0, i) + str.substring(i+1, n));
        permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        // System.out.println("prefix is " + prefix);
        // System.out.println("str is " + str);
        // System.out.println("prefix becomes " + prefix + str.charAt(i));
        // System.out.println("first substring becomes " + str.substring(0, i));
        // System.out.println("second substring becomes " + str.substring(i+1, n));

      }
    }
  }

}
