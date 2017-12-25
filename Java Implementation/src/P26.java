package P26;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by WizardJet on 16/03/2017.
 */
public class Main2 {

    public static void main(String[] args) {
        int longestDigit = 0;
        String longestNum = "";
        for (double i = 2; i < 1000; i++) {
            if (!(i % 5 == 0)) {
                String oriNum = (new BigDecimal(1).divide(new BigDecimal(i), 10000, RoundingMode.HALF_UP)).toString();
                int j = 0;
                while (j < oriNum.length() - 1 && (oriNum.charAt(++j) == '.' || oriNum.charAt(j) == '0')) ;
                String num = oriNum.substring(j, oriNum.length());
                if (num.charAt(0) == '1') {
                    num = num.substring(1, num.length());
                }
//            System.out.println((int) i + ": " + num);
//            System.out.println((int) i + ": " + oriNum);
                String recurring = findRecurring(num);
                if (recurring.length() >= longestDigit) {
//                longestDigit = recurring;
                    longestDigit = (int) i;
                    longestNum = recurring;
                }
//                switch (recurring) {
//                    case "none":
//                    System.out.println("Recurring number does not exist");
//                        break;
//                    default:
//                    System.out.println("Recurring number is " + recurring);
//                }
            }
        }
        System.out.println("Longest digit is " + longestDigit);
        System.out.println("With " + longestNum);

    }

    public static String findRecurring(String num) {
        char firstNum = num.charAt(0);
        int nextComparedIndex = 0;
        int nextComparingIndex = 0;
        String compared = "";
        String comparing = "";
        do {
            nextComparedIndex = nextDigitIndex(num, nextComparedIndex, firstNum);
            if (nextComparedIndex + 1 == num.length()) {
                break;
            }
            compared = num.substring(0, nextComparedIndex);
//            System.out.println("Compared: " + compared);
            nextComparingIndex = nextDigitIndex(num, nextComparedIndex, firstNum, getSkips(compared, firstNum));
            comparing = num.substring(nextComparedIndex, nextComparingIndex);
//            System.out.println("Comparing: " + comparing);
            if (compared.equals(comparing)) {
                comparing = num.substring(nextComparingIndex, nextDigitIndex(num, nextComparingIndex, firstNum, getSkips(compared, firstNum)));
//                System.out.println("Check 1: " + compared.equals(comparing));
                if (compared.equals(comparing)) {
                    nextComparingIndex = nextDigitIndex(num, nextComparingIndex, firstNum, getSkips(compared, firstNum));
                    comparing = num.substring(nextComparingIndex, nextDigitIndex(num, nextComparingIndex, firstNum, getSkips(compared, firstNum)));
//                    System.out.println("Check 2: " + compared.equals(comparing));
                    return compared;
                }
            }
        } while (nextComparingIndex < num.length() / 2 && !compared.equals(comparing));
        return "none";
    }

    public static int nextDigitIndex(String num, int index, char firstNum) {
        while (index < num.length() - 1 && num.charAt(++index) != firstNum) ;
        return index;
    }

    public static int nextDigitIndex(String num, int index, char firstNum, int skipCount) {
        int count = 0;
        do {
            if (num.charAt(++index) == firstNum) {
                count++;
            }
        } while (index < num.length() - 1 && count != skipCount | firstNum != num.charAt(index));
        return index;
    }

    public static int getSkips(String num, char firstNum) {
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == firstNum) {
                count++;
            }
        }
        return count;
    }
}
