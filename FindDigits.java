//Program to solve HackerRank Problem Find Digits.
import java.io.*;
import java.util.Scanner;

public class FindDigits  {
    public static int findDigits(int num) {
        int counter = 0;
        int newNum = num ;
        while (newNum > 0){
            int digit = newNum % 10;
            if(digit != 0){
                if(num % digit == 0)
                    counter++;
            }
            newNum = newNum/10;
        }
        return counter;
    }
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int tc = 0 ; tc < testCases ; tc++){
            int num = scan.nextInt();
            int result = findDigits(num);
            System.out.println(result);
        }
    }
}
