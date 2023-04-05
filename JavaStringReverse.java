import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        sc.close();
        int L = A.length();
        int counter = 0;
        for(int i = 1;i <= (L/2);i++){
            if(A.charAt(i-1) == A.charAt(L-i)){
                counter++;
            }
            else{
                System.out.print("No");
                break;
            }
        }
        if (counter<=(L/2) && counter>=((L/2)-1)){
            System.out.print("Yes");
            }
    }
}
