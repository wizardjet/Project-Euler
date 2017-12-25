public class P19V2 {

  public static void main(String[] args) {

    int day = 6;
    int month = 1;
    int year = 1901;
    int daysInMonth = 0;
    int sundaysOnFirst = 0;
    String[] monthArray = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    while (year < 2001) {

      do {

        switch(month) {
          case 2:
            if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)) {
              daysInMonth = 29;
            }
            else {
              daysInMonth = 28;
            }
            break;
          case 4:
          case 6:
          case 9:
          case 11:
            daysInMonth = 30;
            break;
          default:
            daysInMonth = 31;
            break;
          }

          if (day > daysInMonth) {
            day -= daysInMonth;
            if (month < 12) {
              month++;
              System.out.println();
              System.out.println(monthArray[month]);
            }
            else {
              month = 1;
              year++;
              System.out.println();
              System.out.println();
              System.out.println(year);
              System.out.println(monthArray[month]);
            }
          }

          System.out.print(day + " ");

          if (day == 1 && year != 2001) {
            sundaysOnFirst++;
          }

          day += 7;

        }
        while (day < daysInMonth);

      }

      System.out.println();
      System.out.println();
      System.out.println("Sundays counted: " + sundaysOnFirst);
    }

  }
