//Program to solve the Viral Advertising Problem in HackerRank 

import java.io.*;
import java.util.*;

public class ViralAdvertising {
    // This method takes the number of days as input and returns the total number of likes received over those days.
    public static int viralAdvertising(int day) {
        int likes = 0;
        int totalLikes = 0;
        int recipients = 5;

        // Looping through each day to calculate the number of likes received and updating the number of recipients.
        for (int i = 0; i < day; i++) {
            likes = recipients / 2;
            totalLikes += likes;
            recipients = likes * 3;
        }
        return totalLikes;
    }

    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {

            // Taking input from the user for the day number.
            System.out.println("Enter the day number");
            int day = sc.nextInt();

            // Calling the viralAdvertising() method and printing the result.
            int totalLikes = viralAdvertising(day);
            System.out.println(totalLikes);
        }
    }
}
