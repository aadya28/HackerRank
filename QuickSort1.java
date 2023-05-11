//Program to solve HackerRank problem QuickSort1.
import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class QuickSort1 {
    public static void quickSort(List<Integer> arr , int size){
        int pivot = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for(int i = 1 ; i < size ; i++){
            int element = arr.get(i);
            if(element < pivot)
                left.add(element);
            else
                right.add(element);
        }
        for (Integer integer : left) {
            System.out.print(integer + " ");
        }
        System.out.print(pivot + " ");
        for (Integer integer : right) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        quickSort(arr , n);

        bufferedReader.close();
    }
}
