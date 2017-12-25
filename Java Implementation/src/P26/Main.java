package P26;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int longestDigit = 0;
        String longestNum = "";
        for (double i = 2; i < 1000; i++) {
//        double i = 641;
            String oriNum = (new BigDecimal(1).divide(new BigDecimal(i), 1000, RoundingMode.HALF_UP)).toString();
            int j = 0;
            while (j < oriNum.length() - 1 && (oriNum.charAt(++j) == '.' || oriNum.charAt(j) == '0')) ;
            String num = oriNum.substring(j, oriNum.length());
            if (num.charAt(0) == '1') {
                num = num.substring(1, num.length());
            }
            System.out.println((int) i + ": " + num);
//            System.out.println((int) i + ": " + oriNum);
            String recurring = findRecurring4(num);
            if (recurring.length() >= longestDigit) {
//                longestDigit = recurring;
                longestDigit = (int) i;
                longestNum = recurring;
            }
//            String recurring2 = findRecurring2(num);
//            if (recurring2.length() > longestDigit.length()) {
//                longestDigit = recurring;
//            }
        }
        System.out.println("Longest digit is: " + longestDigit);
        System.out.println("With: " + longestNum);
    }

    public static String findRecurring(String num) {
        List<String> recurList = new ArrayList<>();
        char firstNum = num.charAt(0);
        int nextRecur = 0;
//        int length = 0;
        String recurDigit = "";
        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) == firstNum) {
                if (nextRecur == 0) {
                    nextRecur = i;
//                    length = i;
                    recurDigit = num.substring(0, i);
                } else {
//                    length = i - nextRecur;
//                    if (recurDigit.equals(num.substring(nextRecur, nextRecur + length))) {
                    if (recurDigit.equals(num.substring(nextRecur, i))) {
                        nextRecur = i;
                        recurList.add(recurDigit);
                    } else {
                        nextRecur = i;
                        recurDigit = "";
                    }
                }

            }

        }
        if (recurList.size() > 0) {
            System.out.println("Recurring digit: " + recurList.get(recurList.size() - 1));
            return recurList.get(recurList.size() - 1);
        }
        return "none";
    }

    public static String findRecurring2(String num) {
        List<String> recurList = new ArrayList<>();
        if (num.charAt(0) == '1') {
            num = num.substring(1, num.length());
            char firstNum = num.charAt(0);
            int nextRecur = 0;
            int length = 0;
            String recurDigit = "";
            for (int i = 1; i < num.length(); i++) {
                if (num.charAt(i) == firstNum) {
                    if (nextRecur == 0) {
                        nextRecur = i;
                        length = i;
                        recurDigit = num.substring(0, length);
                    } else {
                        length = i - nextRecur;
                        if (recurDigit.equals(num.substring(nextRecur, nextRecur + length))) {
                            nextRecur = i;
                            recurList.add(recurDigit);
                        } else {
                            nextRecur = 0;
                            recurDigit = "";
                        }
                    }

                }

            }
            if (recurList.size() > 0) {
                System.out.println("Recurring digit: " + recurList.get(recurList.size() - 1));
                return recurList.get(recurList.size() - 1);
            }
        }
        return "none";
    }

    public static String findRecurring3(String num) {
        char firstNum = num.charAt(0);
        int nextRecur = 0;
        String recurDigit = "";
        int numberOfFirstDigits = 0;
        int count = 0;
        List<String> recurList = new ArrayList<>();
        boolean match = false;
        int i = 0;
        while (i < num.length() - 1 && !match) {

            if (num.charAt(++i) == firstNum) {

                if (count == numberOfFirstDigits) {
//                    System.out.println("Going to " + i);

                    if (recurDigit.isEmpty()) {
                        nextRecur = i;
                        recurDigit = num.substring(0, i);
                        System.out.println("initial compared: " + recurDigit);
                        recurList.clear();
                        recurList.add(recurDigit);
                        count--;
                    }

                    else {
                        System.out.println("comparing: " + num.substring(nextRecur, i));

                        if (recurDigit.equals(num.substring(nextRecur, i))) {
                            System.out.println("match found");
                            match = true;
                            recurList.add(recurDigit);
                            nextRecur = i;
                            count--;

                        } else {
                            nextRecur = i;
                            recurDigit = num.substring(0, i);
                            System.out.println("comparing increment: " + recurDigit);
                            recurList.clear();
                            recurList.add(recurDigit);
                            numberOfFirstDigits++;
                            count--;
                        }
                    }
                }
                count++;
            }
            if (recurList.size() > 1) {
                System.out.println("Recurring digit: " + recurList.get(recurList.size() - 1));
                return recurList.get(recurList.size() - 1);
            }
        }
        return "none";
    }

    public static String findRecurring4(String num) {
        char firstNum = num.charAt(0);
        List<String> recurList = new ArrayList<>();

        for (int i = 1; i < num.length() / 2; i++) {

            if (num.charAt(i) == firstNum) {
                String comparedNum = num.substring(0, i);
                System.out.println("Compared with: " + comparedNum + " (substring " + "0," + i + ")");

                for (int j = i; j <= i + comparedNum.length(); j++) {

                        System.out.println("Comparing: " + num.substring(i, j) + " (substring " + i + "," + j + ")");

                        if (comparedNum.equals(num.substring(i, j))) {
                            System.out.println("match found");
                            recurList.add(comparedNum);
                        }


                }

            }
        }
        if ((recurList.size() - 1) >= 1) {
            return recurList.get(recurList.size() - 1);
        }
        return "none";
    }
}

