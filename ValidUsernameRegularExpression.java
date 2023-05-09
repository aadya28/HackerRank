//Program to solve HackerRank Problem Valid Username Regular Expression.
import java.util.Scanner;

public class ValidUsernameRegularExpression {
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        while (n != 0) {
            String userName = scan.nextLine();
            if (userName.matches(regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            n--;
        }
    }
}