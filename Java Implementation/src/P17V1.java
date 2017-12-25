public class P17V1 {

  public static void main(String[] args) {
    int sum = 0;
    String s;
    for (int i = 1; i <= 1000; i++) {
      s = intToString(i);
      for (int j = 0; j < s.length(); j++) {
        if ((s.charAt(j) != ' ') && (s.charAt(j) != '-')) {
          sum++;
        }
      }
    }
    System.out.println("Sum: " + sum);
  }

  public static String intToString(int n) {
    String[] singleArray = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] tenArray = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    String[] specArray = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    String s = "";
    int nLength = ((int)Math.log10(n)+1);
    int firstInt;
    int secondInt;
    int thirdInt;
    switch(nLength) {
      case 1:
        s = singleArray[n];
        break;
      case 2:
        firstInt = n / 10;
        secondInt = n % 10;
        if (secondInt == 0) {
          s = tenArray[firstInt];
        }
        else if (firstInt == 1) {
          s = specArray[secondInt];
        }
        else {
          s = tenArray[firstInt] + "-" + singleArray[secondInt];
        }
        break;
      case 3:
        firstInt = n / 100;
        secondInt = (n % 100) / 10;
        thirdInt = n % 10;
        s = singleArray[firstInt] + "-hundred";
        if (secondInt == 0 && thirdInt == 0) {
          break;
        }
        else if (thirdInt == 0) {
          s = s + " and " + tenArray[secondInt];
        }
        else if (secondInt == 0) {
          s = s + " and " + singleArray[thirdInt];
        }
        else if (secondInt == 1 && thirdInt >= 1) {
          s = s + " and " + specArray[thirdInt];
        }
        else {
          s = s + " and " + tenArray[secondInt] + "-" + singleArray[thirdInt];
        }
        break;
      case 4:
        s = "one thousand";
        break;
    }
    return s;
  }

}
