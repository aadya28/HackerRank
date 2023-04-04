import java.util.*;

public class JavaSubstringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String s = sc.nextLine();
        System.out.println("Enter the length");
        int k = sc.nextInt();
        int n = s.length();
        int len =  (n-k)+1;
        String[] strArray = new String[len];
        for(int i = 0;i<len;i++){
            strArray[i]=s.substring(i,i+k);
        }
        Arrays.sort(strArray);
        System.out.println(strArray[0]+"\n"+strArray[len-1]);
    }
}
