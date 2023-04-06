import java.io.*;
import java.util.*;

public class JavaStringTokens {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int len = str.length();
            String[] arrOfStr = str.split("[@!? .',]", len);
            int arrayLength = arrOfStr.length;
            System.out.println(arrayLength);
            for (String a : arrOfStr)
                if(a!="")
                    System.out.println(a);
        }   
    }
}