//Program to solve HackerRank Problem Java Array List

import java.util.Scanner;
import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfRows = scan.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int row = 0 ; row < numOfRows ; row++){
            int numOfColumns = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int column = 0 ; column < numOfColumns ; column++){
                list.add(scan.nextInt());   
            }
            lists.add(list);
        }

        int queries = scan.nextInt();
        for ( int q = 0 ; q < queries ; q++){
            int row = scan.nextInt();
            int column = scan.nextInt();
            ArrayList<Integer> list = lists.get(row-1);
            if (column <= list.size()) {
                System.out.println(list.get(column-1));
            } else {
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}
