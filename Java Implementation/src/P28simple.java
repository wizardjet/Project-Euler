public class P28simple   {

    private static final int MAX_SPIRAL_SIZE = 1001;

    static int sum = 1;
    /**
     * Keeps track for the number of values added for a specific gap.
     * The maximum number of values for a gap is 4.
     */
    static int counter = 0;
    /**
     * Gap between the numbers.
     * For example, gap between 1 and 3 is 1.
     */ 
    static int gap = 1;
    static int lastInt = 1;

    public static void main(String[] args) {
        while (gap + 2 < MAX_SPIRAL_SIZE || counter != 4) {
            if (counter == 4) {
                gap += 2;
                counter = 0;
            }
            sum += (lastInt += gap + 1);
            counter++;
        }
        System.out.println("Sum = " + sum);
    }

}
