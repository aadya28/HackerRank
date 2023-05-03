//Program to solve the Java HackerRank Problem 2D Array
import java.io.*;
import java.util.*;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        Scanner scan =  new Scanner(System.in);
        int[][] array = new int[6][6];
        
        //Taking input from the user.
        for(int row = 0 ; row < 6 ; row++) {
            for (int column = 0 ; column < 6 ; column++) {
                array[row][column] = scan.nextInt();
            }
        }
        
        //Calculating and printing the largest sum among all the hourglasses.
        int maxSum = 0;
        int sum;
        for(int i = 0 ; i < 4 ; i++) {
            for (int j = 0 ; j < 4 ; j++) {

                //Calculating sum for every hourglass in the array.
                sum = array[i][j]+array[i][j+1]+array[i][j+2]+array[i+1][j+1]+array[i+2][j]+array[i+2][j+1]+array[i+2][j+2];

                //Initialising the value of maxSum as the sum of the first Hourglass.
                if(j == 0 && i == 0)
                    maxSum = sum;

                //Checking if a larger sum exists and reinitialising maxSum.
                if(sum > maxSum)
                    maxSum = sum; 
                   
            }    
        }

        //Printing the output.
        System.out.println(maxSum);
        scan.close();
    }
}


