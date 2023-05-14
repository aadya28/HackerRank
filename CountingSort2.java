//Program to solve HackerRank Problem Counting Sort 2.
import java.io.*;
import java.util.*;

// Defining the CountingSort2 class
public class CountingSort2 {

    // Defining the countingSort function to sort an array using Counting Sort Algorithm
    public static int[] countingSort(int[] arr, int sizeOfArray) {
        // Initializing the frequency array with all elements as 0
        int[] frequency = new int[100];

        // Counting the frequency of each number and storing it at their index values in the frequency array
        for (int i = 0; i < sizeOfArray; i++) {
            int value = arr[i];
            frequency[value] += 1;
        }

        // Initializing a new sorted array
        int[] sortedArray = new int[sizeOfArray];
        int index = 0;

        // Iterating over the frequency array to fill the sorted array in ascending order
        for (int i = 0; i < 100; i++) {
            int counter = frequency[i];
            for (int j = 0; j < counter; j++) {
                sortedArray[index] = i;
                index++;
            }
        }

        // Returning the sorted array
        return sortedArray;
    }

    // Defining the main function to take user input and call the countingSort function
    public static void main(String[] args) throws IOException {
        // Initializing a scanner to take input from user
        Scanner scan = new Scanner(System.in);

        // Taking the size of the array as input
        int sizeOfArray = scan.nextInt();

        // Initializing an array of size sizeOfArray to store the input values
        int[] arr = new int[sizeOfArray];

        // Taking input values and storing them in the array
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scan.nextInt();
        }

        // Calling the countingSort function to sort the array
        int[] result = countingSort(arr, sizeOfArray);

        // Printing the sorted array
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
