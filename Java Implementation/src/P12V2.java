//Highly divisible triangular number
public class P12V2 {

  public static void main(String[] args) {

    int count = 0;
    long increment = 1;
    long num = 1;

    for (int i = 1; count < 500; i++) {
      if (i > 1) {
        increment++;
        num += increment;
      }
      count = 0;
      for (int j = 1; j < Math.sqrt(num); j++) {
        if (num % j == 0) {
          count += 2;
        }
      }
      System.out.println("Triangle number " + num + " of sequence " + i + " has " + count + " divisors");
    }
    System.out.println("Triangle number " + num + " has " + count + " divisors");
  }

}
