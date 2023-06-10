//First attempt at solving HackerRank Problem Drawing Book.
//Solves 23/26 Testcases.

import java.util.Scanner;

public class DrawingBook {
    public static int pageCount(int totalPages, int pageNumber) {
        int frontcounter = 0;
        int f = 1;
        while (f < pageNumber) {
            frontcounter++;
            f += 2;
        }

        int backcounter = 0;
        int b = totalPages - 2;
        if (totalPages % 2 == 0) {
            b = totalPages;
        }
        while (b > pageNumber) {
            backcounter++;
            b -= 2;
        }

        if (backcounter < frontcounter) {
            return backcounter;
        }
        return frontcounter;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalPages = scan.nextInt();
        int pageNumber = scan.nextInt();
        int result = pageCount(totalPages, pageNumber);
        System.out.println(result);
        scan.close();
    }
}