//Program to solve HackerRank Problem Find The Median(fails 1 testcase due to exceeding time limit).
import java.io.*;
import java.util.*;

public class FindTheMedian{
    public static int findMedian(int[] arr , int endIndex) {
        for(int i = 0 ; i <= endIndex/2 ; i++){
            for(int j = 0 ; j < endIndex-i ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int result = arr[endIndex/2];
        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int sizeOfArray = scan.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0 ; i < sizeOfArray ; i++){
            arr[i] = scan.nextInt();
        }
        int result =  findMedian(arr , sizeOfArray-1);
        System.out.print(result);
    }
}
