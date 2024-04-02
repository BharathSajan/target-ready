package Day1;
import java.util.Scanner;

public class assgn1 {

    public static void printCalendar(int month, int year) {
        if (isValidInput(month, year)) {
            printHeader();
            printMonthCalendar(month, year);
        } else {
            System.out.println("Invalid input. Please provide valid month and year.");
        }
    }

    private static boolean isValidInput(int month, int year) {
        return (month >= 1 && month <= 12 && year >= 0);
    }

    private static void printHeader() {
        System.out.println("Su Mo Tu We Th Fr Sa");
    }

    private static void printMonthCalendar(int month, int year) {
        int startDayOfMonth = getStartDayOfMonth(month, year);
        int numOfDaysInMonth = getNumOfDaysInMonth(month, year);

        for (int i = 0; i < startDayOfMonth; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= numOfDaysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + startDayOfMonth) % 7 == 0 || day == numOfDaysInMonth) {
                System.out.println();
            }
        }
    }

    private static int getStartDayOfMonth(int month, int year) {
        // Zeller's Congruence algorithm
        int q = 1;
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int k = year % 100;
        int j = year / 100;
        int m = month;
        int h = (q + (int)((13 * (m + 1)) / 5) + k + (int)(k / 4) + (int)(j / 4) - 2 * j) % 7;
        return ((h + 6) % 7);
    }

    private static int getNumOfDaysInMonth(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        printCalendar(month, year);
        scanner.close();
    }
}
