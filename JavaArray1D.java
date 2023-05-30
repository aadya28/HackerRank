//First attempt at solving Java Problem 1D Array(Part 2).
//Solves 3 of 10 Testcases.
import java.util.*;

public class JavaArray1D {
    public static boolean canWin(int leap, int[] game , int endIndex) {
        int i = 0;
        while(i <= endIndex){
            if(i+leap >= endIndex){
                break;
            }
            if(game[i+leap] == 0){
                i = i+leap;
            } else if (game[i+1] == 0) {
                i++;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfQueries = scan.nextInt();
        while (numOfQueries-- > 0) {
            int sizeOfArray = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[sizeOfArray];
            for (int i = 0; i < sizeOfArray; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println( (canWin(leap, game , sizeOfArray-1)) ? "YES" : "NO" );
        }
        scan.close();
    }
}