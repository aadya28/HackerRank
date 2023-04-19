//Separating tokens in a string and printing the total number of them
import java.util.*;

public class JavaStringTokens {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int counter = 0;
            String[] arrOfStr = str.split("[@!? .',]");
            for (String a : arrOfStr)
                if(a=="")
                    counter++;
            int arrayLength = arrOfStr.length;
            System.out.println(arrayLength-counter);
            for (String a : arrOfStr)
                if(a!="")
                    System.out.println(a);
        }   
    }
}