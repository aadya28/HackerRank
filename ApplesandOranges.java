import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class ApplesandOranges {
    public static void countApplesAndOranges(int startRange, int endRange, int appleTree, int orangeTree, int numberOfApples, int numberOfOranges, List<Integer> apples, List<Integer> oranges) {
        int countApples = 0;
        int countOranges = 0;
        for (int i = 0 ; i < numberOfApples ; i++){
            int apple = apples.get(i);
            if(apple+appleTree>=startRange && apple+appleTree<=endRange){
                countApples++;
            }
        }
        for (int i = 0 ; i < numberOfOranges ; i++){
            int orange = oranges.get(i);
            if(orange+orangeTree>=startRange && orange+orangeTree<=endRange){
                countOranges++;
            }
        }
        System.out.println(countApples); 
        System.out.println(countOranges);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int startRange = Integer.parseInt(firstMultipleInput[0]);

        int endRange = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int appleTree = Integer.parseInt(secondMultipleInput[0]);

        int orangeTree = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int numberOfApples = Integer.parseInt(thirdMultipleInput[0]);

        int numberOfOranges = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        countApplesAndOranges(startRange, endRange, appleTree, orangeTree, numberOfApples, numberOfOranges, apples, oranges);

        bufferedReader.close();
    }
}

