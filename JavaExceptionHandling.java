//Program to solve HackerRank problem Java Exception Handling.
import java.util.Scanner;

class PowerCalculator {
    public long power(int n,int p) throws Exception {
        if(n==0 && p==0){
            throw new Exception("n and p should not be zero.");
        }
        else if(n<0 || p<0){
            throw new Exception("n or p should not be negative.");
        }
        else{
            return (long)Math.pow(n,p);
        }
    }
}

public class JavaExceptionHandling {
    public static final PowerCalculator power_calculator = new PowerCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(power_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}