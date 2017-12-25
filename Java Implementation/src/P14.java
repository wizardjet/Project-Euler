public class P14 {

  private static final int NUM = 1000000;

  public static void main(String[] args) {

    int longestChain = 0;
    int lStartingNumber = 0;

    for (int i = 1; i <= NUM; i++) {

      System.out.println("Processing number " + i);

      int chain = 0;
      long startingNumber = i;

      do {

        if (startingNumber % 2 == 0) {
          startingNumber /= 2;
          System.out.println("Starting number: " + startingNumber + " i: " + i);
          chain++;
        }
        else {
          startingNumber = 3*startingNumber + 1;
          System.out.println("Starting number: " + startingNumber + " i: " + i);
          chain++;
        }

      }
      while (startingNumber != 1);

      System.out.println("Starting number " + i + " has longest chain " + chain);

      if (chain > longestChain) {
        longestChain = chain;
        lStartingNumber = i;
      }
    }

    System.out.println("Longest chain is: " + longestChain + " with starting number " + lStartingNumber);
    //Longest chain is: 524 with starting number 837799

  }
}
