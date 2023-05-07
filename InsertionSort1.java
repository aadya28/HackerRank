//Program to solve HackerRank Problem Insertion Sort.
import java.util.Scanner;
import java.io.*;

public class InsertionSort1 {

    // Method to perform insertion sort for an array given an element to be inserted and its last index
    public static void insertionSort1(int[] array , int toBeInserted ,int lastIndex) {
        int i = lastIndex-1;
        while(toBeInserted < array[i]){
            array[i+1] = array[i];
            printArray(array , lastIndex);
            i--;
            if(i == -1)
                break;
        }
        array[i+1] = toBeInserted;
        printArray(array , lastIndex);
    }

    // Method to print the array
    public static void printArray(int[] array , int lastIndex){
        for (int j = 0 ; j <= lastIndex ; j++){
            System.out.print(array[j]+" ");
        }
        System.out.println();
    }

    //Method to take input of array from the user to perform insertion sort.
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int sizeOfArray = scan.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i  = 0 ; i < sizeOfArray ; i++){
            array[i] = scan.nextInt();
        }
        int lastIndex = sizeOfArray-1;
        int toBeInserted = array[lastIndex];
        insertionSort1(array, toBeInserted , lastIndex);
        scan.close();
    }
}

