//Program to solve HackerRank Problem Utopian Tree.
import java.io.*;
import java.util.Scanner;

public class UtopianTree {
    public static int utopianTree(int numOfCycles) {
        int height = 1;
        for (int i = 0 ; i < numOfCycles ; i++){
            if (i%2 == 0)
                height *= 2;
            else
                height += 1;
        }
        return height;
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        for(int i = 0 ; i < testcases ; i++){
            int numOfCycles = scan.nextInt();
            int result = utopianTree(numOfCycles);
            System.out.println(result);
        }
    }
}