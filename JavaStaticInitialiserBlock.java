import java.util.*;

public class JavaStaticInitialiserBlock {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int h = sc.nextInt();
            int b = sc.nextInt();
            if (h>0 && b>0){
                    int area = b*h;
                    System.out.println(area);
            }
            else{
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
    }
}