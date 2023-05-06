//First attempt at solving HackerRank Problem Insertion Sort.
import java.util.Scanner;
import java.io.*;

public class InsertionSort1 {
    public static void insertionSort1(int[] array , int toBeInserted ,int lastIndex) {
        for(int i = lastIndex-1 ; i >= 0 ; i--){
            if(toBeInserted < array[i] && i != 0) {
                array[i+1] = array[i];
                printArray(array, lastIndex);
            }
            else if (toBeInserted >= array[i]){
                array[i+1] = toBeInserted;
                printArray(array ,lastIndex);
                break;
            }
            else {
                array[1] = array[0];
                array[0] = toBeInserted;
                printArray(array , lastIndex);
            }
        }
    }
    public static void printArray(int[] array , int lastIndex){
        for (int j = 0 ; j <= lastIndex ; j++){
            System.out.print(array[j]+" ");
        }
        System.out.println();
    }
    
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

