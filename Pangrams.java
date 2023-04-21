//A pangram is a string that contains every letter of the alphabet. 
//Determine whether the given string is a pangram .Ignore case. Return either pangram or not pangram as appropriate.

import java.util.Scanner;

public class Pangrams {
    public static String pangrams(String str) {
        int counter = 0;
        String lower = str.toLowerCase();  
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int len = lower.length();
        for (int i = 0 ; i < len ; i++){
            Character ch = lower.charAt(i);
            int idx = alphabet.indexOf(ch); //to check if the character is an alphabet
            if (idx != -1){
                counter++;   //if it is an alphabet then increasing the counter
                lower = lower.replace(ch, '*');  //replacing it to prevent multiple increments for one alphabet
            }
        }
        if(counter == 26){
            return "Pangram";
        }
        else{
            return "Not Pangram";
        }
        }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            String result = pangrams(str);
            System.out.println(result);
        } 
    }
}
