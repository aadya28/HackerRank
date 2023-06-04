//Program to solve the HackerRank Problem "Save The Prisoner" .

import java.util.Scanner;

public class SaveThePrisoner {
    public static int saveThePrisoner(int totalChairs, int candies, int startingChair) {
        int num = startingChair + candies - 1;
        // subtracting 1 because distribution starts from the given chair itself.
        while (num > totalChairs) {
            num -= totalChairs;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int i = 0; i < testCases; i++) {
            int prisoners = scan.nextInt();
            int candies = scan.nextInt();
            int chair = scan.nextInt();
            int result = saveThePrisoner(prisoners, candies, chair);
            System.out.println(result);
        }
        scan.close();
    }
}
