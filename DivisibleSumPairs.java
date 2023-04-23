//Program to determine the number of pairs (i,j) where i<j arr[i] + arr[j] is divisible by k .

import java.io.*;
import java.util.*;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> arr) {
        int count = 0;
        for ( int i = 0 ; i < n ; i++){
            for( int j = i+1 ; j < n ; j++){
                int num1 = arr.get(i);
                int num2 = arr.get(j);
                if((num1+num2)%k == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> mylist = new ArrayList<Integer>();
            for (int i = 0 ; i < n ; i++) {
                mylist.add(sc.nextInt());
            }
            int result = divisibleSumPairs(n, k, mylist);
            System.out.println(result);
        }
    }
}
