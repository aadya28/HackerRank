//Program to solve HackerRank Problem Equalise The Array.
import java.util.Scanner;

public class EqualiseTheArray {
    public static int equalizeArray(int[] arr , int size) {
        int maxRepetition = 0;
        /*Take one element at a time, count how many times it comes
        * If it is more than the previous counter then update maxRepetition
        * Find minDeletion by subtracting maxRepetition from size of array. */
        for(int i = 0 ;i < size-1 ; i++){
            int counter = 1;
            for(int j = i+1 ;j < size ; j++){
                if(arr[i] == arr[j]){
                    counter++;
                }
            }
            if(counter > maxRepetition){
                maxRepetition = counter;
            }
        }
        return size-maxRepetition;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        int result = equalizeArray(arr , size);
        System.out.println(result);
    }
}
