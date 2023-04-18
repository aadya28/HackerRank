//Program to find the total number of occurence the maximum number in the given array
import java.util.Scanner;

public class BirthdayCakeCandles  {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int counter = 0;
            int maxHeight = 0;
            int n = sc.nextInt();
            int num;
            for (int i = 0 ; i < n ; i++){
                num = sc.nextInt();
                if(maxHeight < num){
                    maxHeight = num;
                    counter = 1;
                }
                else if(maxHeight == num){
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}

