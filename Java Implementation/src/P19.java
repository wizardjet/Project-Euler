public class P19 {

  static int dayInMonth = 7;
  static int monthInYear = 1;
  static int year = 1900;
  static int daysInMonth = 0;
  static int sundaysOnFirst = 0;

  public static void main(String[] args) {

    do {

      do {

        switch(monthInYear) {
          case 2:
            if (year % 100 == 0) {
              if (year % 400 == 0) {
                daysInMonth = 29;
              }
              else {
                daysInMonth = 28;
              }
            }
            else if (year % 4 == 0) {
              daysInMonth = 29;
            }
            else {
              daysInMonth = 28;
            }
            break;
          case 4:
            daysInMonth = 30;
            break;
          case 6:
            daysInMonth = 30;
            break;
          case 9:
            daysInMonth = 30;
            break;
          case 11:
            daysInMonth = 30;
            break;
          default:
            daysInMonth = 31;
            break;
        }

        if (dayInMonth > daysInMonth) {
          dayInMonth -= daysInMonth;
          if (monthInYear < 12) {
            monthInYear++;
          }
          else {
            monthInYear = 1;
            year++;
          }
        }

        System.out.println("Evaluating Year " + year + " Month " + monthInYear + " Day " + dayInMonth);

        if (dayInMonth == 1 && year != 1900 && year != 2001) {
          sundaysOnFirst++;
        }

        dayInMonth += 7;

      }
      while (dayInMonth < daysInMonth);

    }
    while (year < 2001);

    System.out.println("Sundays counted: " + sundaysOnFirst);
  }

}
