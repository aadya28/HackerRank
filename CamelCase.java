import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string");
            String str = sc.nextLine();
            System.out.println(camelcase(str));
        }
        
    }

    public static int camelcase(String str){
        int counter = 1;    // First word starts with a lowercase letter
        int strLength = str.length();
        for (int i = 0 ; i < strLength ; i++ ){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                counter++;
            }
        }
        return counter;
    }
    }

