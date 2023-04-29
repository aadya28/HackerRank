//First attempt at solving HackerRank Java Problem Java List
import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            List<Integer> lst = new ArrayList<>(size);
            for(int i = 0 ; i < size ; i++)
               lst.add(sc.nextInt());
            int numOfQueries = sc.nextInt();
            for(int j = 0 ; j < numOfQueries ; j++){
                String query = sc.next();
                if(query.equals("Insert")){
                    int index = sc.nextInt();
                    int element = sc.nextInt();
                    lst.add(index,element);
                }
                if(query.equals("Delete")){
                    int index = sc.nextInt();
                    lst.remove(index);
                }
            }
            for(int i =0 ; i < size ; i++){
                System.out.print(lst.get(i)+" ");
            } 
        }
    }
}