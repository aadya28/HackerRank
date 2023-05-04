//Program to solve HackerRank Java Problem Java List
import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            ArrayList<Integer> lst = new ArrayList<>();
            for(int i = 0 ; i < size ; i++)
               lst.add(sc.nextInt());
            int numOfQueries = sc.nextInt();
            for(int j = 0 ; j < numOfQueries ; j++){
                String query = sc.next();
                if(query.equals("Insert")){     //Equals is used with objects and == is used with literals or primitives. 
                    int index = sc.nextInt();
                    Integer element = sc.nextInt();
                    lst.add(index,element);
                    size++; // update the size of the ArrayList
                }
                if(query.equals("Delete")){
                    int index = sc.nextInt();
                    lst.remove(index);
                    size--; // update the size of the ArrayList
                }
            }
            for(int i =0 ; i < size ; i++){
                System.out.print(lst.get(i)+" ");
            } 
        } catch (Exception e) {
            // handle the exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}
