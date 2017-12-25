//Largest palindrome product
public class P4 {

  public static void main(String[] args) {
    int largestPalindrome = 0;
    for (int i = 0; i < 1000; i++) {
      for (int j = 0; j < 1000; j++) {
        int k = i*j;
        if (isAPalindrome(k)) {
          if (k > largestPalindrome) {
            largestPalindrome = k;
            System.out.println("Largest palindrome is " + k);
          }
        }
      }
    }
    System.out.println("The largest palindrome is " + largestPalindrome);
  }

  public static boolean isAPalindrome(int n) {
    String s = Integer.toString(n);
    for (int i = 0; i < (s.length()/2); i++) {
      if (s.charAt(i) != s.charAt(s.length()-(i+1))) {
        return false;
      }
    }
    return true;
  }
}
