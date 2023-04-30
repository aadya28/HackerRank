//Program to solve HackerRank Problem Java Sub arrays. 
import java.util.*;

public class JavaSubArrays {
    public static int countNegativeSubArray( int lengthOfArr , int array[]) { 
        int counter = 0;    
        for(int sizeOfArrays = 1 ; sizeOfArrays <= lengthOfArr ; sizeOfArrays++) {    //Determines the size of array
            int numOfArrays = lengthOfArr-sizeOfArrays+1;
            for(int startIndex = 0 ; startIndex < numOfArrays ; startIndex++) {    //Determines the number of arrays of a particular size
                int endIndex = startIndex+sizeOfArrays; 
                int sum = 0;
                for (int element = startIndex ; element < endIndex ; element++) {    //Gets the current array elements    
                    sum += array[element];  
                }
                if(sum < 0)
                    counter++;
            }
        }
        return counter;
    } 

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int lengthOfArray = sc.nextInt();
            int[] array = new int[lengthOfArray];
            for (int i = 0 ; i < lengthOfArray ; i++){
                array[i] = sc.nextInt();
            }
            int num = countNegativeSubArray(lengthOfArray, array);
            System.out.println(num);
        } 
    }
}
