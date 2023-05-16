//Program to solve the HackerRank Problem Running Time of Algorithm.
//Insertion Sort is an O(N^2) time complexity algorithm.

import java.io.*;
import java.util.*;

public class RunningTimeOfAlgorithms {
    public static int runningTime(int[] array) {
        int count = 0;
        for(int i = 1 ; i < array.length ; i++){
            //This will iterate through every element except 0th index.
            int currentElement = array[i];
            int indexToCompare = i-1;
            while (indexToCompare >= 0 && currentElement < array[indexToCompare] ){
                //Shift the larger element to right.
                array[indexToCompare+1]=array[indexToCompare];
                count += 1;
                indexToCompare--;
            }
            //Substituting the current element at the empty index position.
            array[indexToCompare+1] = currentElement;
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int lengthOfArray = scan.nextInt();
        int[] array = new int[lengthOfArray];
        for(int i = 0 ; i < lengthOfArray ; i++){
            array[i] = scan.nextInt();
        }
        int result = runningTime(array);
        System.out.println(result);
        scan.close();
    }
}
