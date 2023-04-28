//Program to solve the Hurdle Race Problem in HackerRank 

import java.io.*;
import java.util.*;

public class HurdleRace {

    // This method takes an array of integers representing the heights of the hurdles,
    // the length of the array, and the maximum height the player can jump.
    // It returns the number of doses required to increase the player's maximum jump height to clear the tallest hurdle.
    public static int hurdleRace(int[] heightOfHurdles, int arrayLength, int maxHeight) {
        int maxHurdleHeight = heightOfHurdles[0];

        // Finding the maximum value of the array elements
        for(int i = 1; i < arrayLength; i++) {
            if(heightOfHurdles[i] > maxHurdleHeight) {
                maxHurdleHeight = heightOfHurdles[i];
            }
        }

        // Calculating the number of doses required
        if(maxHurdleHeight > maxHeight) {
            return maxHurdleHeight - maxHeight;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {

            // Taking input from the user for the size of the array and the maximum height the player can jump.
            System.out.println("Enter the size of the array");
            int arrayLength = sc.nextInt();
            System.out.println("Enter the maximum height that can be climbed");
            int maxHeight = sc.nextInt();

            // Taking input from the user for the array of hurdle heights.
            int[] heightOfHurdles = new int[arrayLength];
            System.out.println("Enter the array");
            for(int i = 0; i < arrayLength; i++) {
                heightOfHurdles[i] = sc.nextInt();
            }

            // Calling the hurdleRace() method and printing the result.
            int numOfDoses = hurdleRace(heightOfHurdles, arrayLength, maxHeight);
            System.out.println(numOfDoses);
        }
    }
}
