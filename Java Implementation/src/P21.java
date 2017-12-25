public class P21 {

  public static void main(String[] args) {

    int sumOfAmicableNumbers = 0;

    for (int i = 1; i <= 10000; i++) {
      int j = sumOfDivisors(i);
      if ((sumOfDivisors(j) == i) && (i != j)) {
        sumOfAmicableNumbers += i;
        System.out.println("Amicable pair found: " + i + ", " + j);
      }
    }

    System.out.println("Sum: " + sumOfAmicableNumbers);
  }

  public static int sumOfDivisors(int n) {
    int result = 0;
    for (int i = 1; i <= (n/2); i++) {
      if (n % i == 0) {
        result += i;
      }
    }
    return result;
  }

}
