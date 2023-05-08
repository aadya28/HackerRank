//Program to solve HackerRank Problem Insertion Sort Part 2.
import java.util.Scanner;

public class InsertionSort2 {
    public static void insertionSort2(int[] array , int size) {
        for (int i = 1; i < size; i++) {
            int j = i;
            int value = array[i];
            while (j >= 1 && array[j-1] > value) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = value;
            printArray(array,size);
        }
    }

    public static void printArray(int[] array , int sizeOfArray){
        for (int j = 0 ; j < sizeOfArray ; j++){
            System.out.print(array[j]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeOfArray = scan.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i = 0 ; i < sizeOfArray ; i++){
            array[i] = scan.nextInt();
        }
        insertionSort2(array , sizeOfArray);
    }
}
