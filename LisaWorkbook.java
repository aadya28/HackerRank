//First attempt at solving HackerRank Problem Lisa's WorkBook.
//Solves 4/11 testcases.
import java.util.Scanner;

public class LisaWorkbook {
    public static int workbook(int numOfChapters ,int maxProblemsPerPage, int[] totalQuestions) {
        int pageNumber = 1;
        int counter = 0;
        for(int i = 0 ;i < numOfChapters ; i++){
            int firstProblemNumber = 1;
            int questionsLeft = totalQuestions[i];
            int lastProblemNumber = Math.min(questionsLeft, maxProblemsPerPage);
            do{
                if(firstProblemNumber <= pageNumber && pageNumber <= lastProblemNumber){
                    counter++;
                }
                pageNumber++;
                firstProblemNumber += maxProblemsPerPage;
                lastProblemNumber += maxProblemsPerPage;
                questionsLeft -= maxProblemsPerPage;
            }while (questionsLeft > 0);
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfChapters = scan.nextInt();
        int maxProblemsPerPage = scan.nextInt();
        int[] totalQuestions = new int[numOfChapters];
        for (int i = 0; i < numOfChapters ; i++) {
            totalQuestions[i] = scan.nextInt();
        }
        int result = workbook(numOfChapters , maxProblemsPerPage, totalQuestions);
        System.out.println(result);
    }
}
