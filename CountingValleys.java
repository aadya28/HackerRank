//First attempt at solving HackerRank Problem Counting Valleys.
import java.util.Scanner;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int valleys = -1;
        int seaLevel = 0;
        for(int i = 0 ; i < steps ; i++){
            char step = path.charAt(i);
            if (step == 'U'){
                seaLevel += 1;
            }
            else {
                seaLevel -= 1;
            }
            if (seaLevel == 0){
                valleys += 1;
            }
        }
        return valleys;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int steps = scan.nextInt();
        scan.nextLine();
        String path = scan.nextLine();
        int result = countingValleys(steps, path);
        System.out.println(result);
        scan.close();
    }
}



