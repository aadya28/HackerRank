//Program to solve HackerRank Problem "Library Fine" .

import java.util.Scanner;

public class LibraryFine {
    public static int libraryFine(int rDate, int rMonth, int rYear, int dDate, int dMonth, int dYear) {
        if (rYear > dYear) {
            return 10000;
        } else if (rYear == dYear && rMonth > dMonth) {
            return 500 * (rMonth - dMonth);
        } else if (rYear == dYear && rMonth == dMonth && rDate > dDate) {
            return 15 * (rDate - dDate);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int returnDate = scan.nextInt();
        int returnMonth = scan.nextInt();
        int returnYear = scan.nextInt();
        int dueDate = scan.nextInt();
        int dueMonth = scan.nextInt();
        int dueYear = scan.nextInt();
        int result = libraryFine(returnDate, returnMonth, returnYear, dueDate, dueMonth, dueYear);
        System.out.println(result);
        scan.close();
    }
}
