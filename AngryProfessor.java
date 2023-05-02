//Program to solve HackerRank Problem Angry Professor

import java.io.*;
import java.util.*;

public class AngryProfessor {
    public static String angryProfessor(int threshhold, int[] array , int arraylength) {
        int counter = 0;
        for (int i = 0 ; i < arraylength ; i++){
            if(array[i] <= 0){  //Counting the number of students present in the class
                counter++;
            }
        }
        if(counter < threshhold){   //If the count is less than the threshhold number then class is cancelled
            return "YES";
        }
        return "NO";
        }
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int tc = 0 ; tc < testCases ; tc++){
            int arrayLength = scan.nextInt();
            int threshhold = scan.nextInt();
            int[] array = new int[arrayLength];
            for (int i = 0 ; i < arrayLength ; i++){
                array[i] = scan.nextInt();
            }
            String str = angryProfessor(threshhold, array , arrayLength);
            System.out.println(str);
        }
        scan.close();
    }
}
