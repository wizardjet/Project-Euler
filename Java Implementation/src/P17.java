public class P17 {

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
    int nLength = ((int)Math.log10(n)+1);
    String s = "";
    switch(nLength) {
      case 1:
        s = oneDigit(n);
        break;
      case 2:
        if ((n % 10 == 0) || (n >= 11 && n <= 19)) {
          s = twoDigit(n);
        }
        else {
          s = twoDigit(n) + "-" + oneDigit(n);
        }
        break;
      case 3:
        int firstInt = n / 100;
        if (n % 100 == 0) {
          s = oneDigit(firstInt) + "-hundred";
        }
        else if (n % 10 == 0) {
          s = oneDigit(firstInt) + "-hundred and " + twoDigit(n);
        }
        else if (n % 100 <= 10) {
          s = oneDigit(firstInt) + "-hundred and " + oneDigit(n);
        }
        else if ((n % 100 >= 11) && (n % 100 <= 19)) {
          s = oneDigit(firstInt) + "-hundred and " + twoDigit(n);
        }
        else {
          s = oneDigit(firstInt) + "-hundred and " + twoDigit(n) + "-" + oneDigit(n);
        }
        break;
      case 4:
        s = "one thousand";
        break;
    }
    return s;
  }

  public static String oneDigit(int n) {
    int value = 0;
    String s = "";
    if (n < 10) {
      value = n;
    }
    else if (n < 1000) {
      value = n % 10;
    }
    switch(value) {
      case 1:
        s = "one";
        break;
      case 2:
        s = "two";
        break;
      case 3:
        s = "three";
        break;
      case 4:
        s = "four";
        break;
      case 5:
        s = "five";
        break;
      case 6:
        s = "six";
        break;
      case 7:
        s = "seven";
        break;
      case 8:
        s = "eight";
        break;
      case 9:
        s = "nine";
        break;
      }
      return s;
    }

    public static String twoDigit(int n) {
      int value = 0;
      String s = "";
      if ((n >= 11) && (n <= 19)) {
        value = n;
      }
      else if (((n % 100) >= 11) && ((n % 100) <= 19)) {
        value = n % 100;
      }
      else if (n < 100) {
        value = n / 10;
      }
      else if (n < 1000) {
        value = ((n % 100) / 10);
      }
      switch(value) {
        case 1:
          s = "ten";
          break;
        case 2:
          s = "twenty";
          break;
        case 3:
          s = "thirty";
          break;
        case 4:
          s = "forty";
          break;
        case 5:
          s = "fifty";
          break;
        case 6:
          s = "sixty";
          break;
        case 7:
          s = "seventy";
          break;
        case 8:
          s = "eighty";
          break;
        case 9:
          s = "ninety";
          break;
        case 11:
          s = "eleven";
          break;
        case 12:
          s = "twelve";
          break;
        case 13:
          s = "thirteen";
          break;
        case 14:
          s = "fourteen";
          break;
        case 15:
          s = "fifteen";
          break;
        case 16:
          s = "sixteen";
          break;
        case 17:
          s = "seventeen";
          break;
        case 18:
          s = "eighteen";
          break;
        case 19:
          s = "nineteen";
          break;
      }
      return s;
    }
  }
