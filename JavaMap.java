//First attempt at solving the HackerRank Problem Java Map.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class JavaMap {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numOfEntries = scan.nextInt();
        Map<String,Integer> phoneNumbers = new HashMap<>();
        for(int i = 0; i < numOfEntries; i++)
        {
            String name = scan.nextLine();
            int phoneNumber = scan.nextInt();
            phoneNumbers.put(name, phoneNumber);
            scan.nextLine(); // consume the newline character
        }
        while(scan.hasNext())
        {
            String str = scan.nextLine();
            Integer phoneNumber = phoneNumbers.get(str);
            if (phoneNumber != null) {
                System.out.println(phoneNumber);
            } else {
                System.out.println("Not found");
            }
        }
    }
}
