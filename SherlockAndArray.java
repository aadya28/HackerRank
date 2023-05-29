//Program to solve HackerRank Problem Sherlock and Arrays.
import java.io.*;
import java.util.*;

public class SherlockAndArray {
    public static String balancedSums(int[] arr , int sizeOfArray) {
        /*This is solved by the logic that since both leftSum and rightSum need to be equal
        * We can assume them to be x resulting in equation
        * x + y + x = sumOfArray ;where y = value of current index element
        * 2*x + y = sumOfArray
        * 2*x = sumOfArray - y */
        int sum = 0 ;
        int leftSum = 0;
        for(int j = 0 ; j < sizeOfArray ; j++){
            sum += arr[j];
        }
        for(int j = 0 ; j < sizeOfArray ; j++) {
            if (2 * leftSum == sum - arr[j]) {
                return "YES";
            } else {
                leftSum += arr[j];
            }
        }
        return "NO";
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int tc = 0 ; tc < testCases ; tc++){
            int sizeOfArray = scan.nextInt();
            int[] arr = new int[sizeOfArray];
            for (int i = 0 ; i < sizeOfArray ; i++){
                arr[i] = scan.nextInt();
            }
            String result = balancedSums(arr , sizeOfArray);
            System.out.println(result);
        }
    }
}