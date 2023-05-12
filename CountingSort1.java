//Program to solve HackerRank Problem Counting Sort 1.
import java.io.*;
import java.util.*;

public class CountingSort1 {
    public static int[] countingSort(int[] arr , int sizeOfArray) {
        int[] frequency = new int[100];     //All elements are initially stored as 0
        for(int i = 0 ; i < sizeOfArray ; i++){
            int value = arr[i];
            frequency[value] += 1;
        }
        return frequency;
    }
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int sizeOfArray = scan.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0 ; i < sizeOfArray ; i++){
            arr[i] = scan.nextInt();
        }
        int[] result =  countingSort(arr , sizeOfArray);
        for (int i = 0 ; i < 100 ; i++){
            System.out.print(result[i] + " ");
        }
    }
}
