//Program to solve HackerRank Problem Electronics Shop.
import java.io.*;
import java.util.*;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
        int moneyspent = -1;
        for(int i = 0 ; i < keyboards.length ; i++){
            for (int j = 0 ; j < drives.length ; j++){
                int currentTotalCost = keyboards[i]+drives[j];
                if(currentTotalCost <= budget && currentTotalCost > moneyspent){
                    moneyspent = currentTotalCost;
                }
            }
        }
        return moneyspent;
    }
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        //Taking Input
        int budget = scan.nextInt();
        int numOfKeyboards = scan.nextInt();
        int numOfDrives = scan.nextInt();

        int[] keyboards = new int[numOfKeyboards];
        for (int keyboardsItr = 0; keyboardsItr < numOfKeyboards; keyboardsItr++) {
            keyboards[keyboardsItr] = scan.nextInt();
        }

        int[] drives = new int[numOfDrives];
        for (int drivesItr = 0; drivesItr < numOfDrives; drivesItr++) {
            drives[drivesItr] = scan.nextInt();
        }

        //Printing Output
        int moneySpent = getMoneySpent(keyboards, drives, budget);
        System.out.println(moneySpent);
        scan.close();
    }
}
