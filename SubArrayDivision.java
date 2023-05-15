//Program to solve HackerRank Problem SubArray Division.

/*Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,

The sum of the integers on the squares is equal to his birthday.

Determine how many ways she can divide the chocolate.*/

import java.io.*;
import java.util.*;

public class SubArrayDivision {
    public static int birthday(int[] array, int sumOfSubArray, int lengthOfSubArray , int lengthOfArray) {
        int count = 0;
        for(int startIndex = 0 ; startIndex  <= lengthOfArray-lengthOfSubArray ; startIndex ++){
            int endIndex = startIndex + lengthOfSubArray;
            int sum = 0;
            for (int index = startIndex ; index < endIndex ; index++){
                sum += array[index];
            }
            if (sum == sumOfSubArray){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size ; i++){
            array[i] = scan.nextInt();
        }
        int day = scan.nextInt();
        int month = scan.nextInt();
        int result =birthday(array, day, month ,size);
        System.out.println(result);
        scan.close();
    }
}
