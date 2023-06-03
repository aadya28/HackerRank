//Program to solve the HackerRank Problem Sequence Equation.
import java.util.Scanner;

public class SequenceEquation {
    public static int[] permutationEquation(int[] array, int size){
        int[] result = new int[size];
        for(int i = 0 ; i < size ; i++){
            int findValue1 = i+1;
            int findValue2  = -1;
            for(int j = 0 ; j < size ; j++){
                if(findValue1 == array[j]){
                    findValue2 = j+1;
                    break;
                }
            }

            for(int k = 0 ; k < size ; k++){
                if(findValue2 == array[k]){
                    result[i] = k+1;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0 ; i < size ; i++){
            array[i] = scan.nextInt();
        }
        int[] result = permutationEquation(array , size);
        for(int i = 0 ; i < size ; i++){
            System.out.println(result[i]);
        }
    }
}
