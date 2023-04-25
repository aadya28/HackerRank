import java.io.*;
import java.util.*;
import static java.lang.Math.abs;

public class CatsAndAMouse {
    public static String catAndMouse(int x, int y, int z) {
        int CatA = abs(z-x);
        int CatB = abs(z-y);
        if(CatA < CatB){
            return "Cat A";
        }
        else if(CatB < CatA){
            return "Cat B";
        }
        else{
            return "Mouse C";
        }
    }
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            int testCases = sc.nextInt();
            for (int i = 0 ; i < testCases ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println(catAndMouse(x, y, z));}
        }   
        }
}

