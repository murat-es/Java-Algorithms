import java.util.Random;
import java.util.Scanner;

public class GradingSystem{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of student : ");
        int student = input.nextInt();
        System.out.print("Enter the number of question : ");
        int question = input.nextInt();

        char[][] allAnswers = new char[student][question];
        char[] answerKey = new char[question];

        System.out.println("------------------------------------------------------------------");

        System.out.println(" Answer Key -------------------------------------------------- ");
        System.out.print("                                ");
        CreateAnswerKey(answerKey);
        System.out.println();

        System.out.print(" Answers of students -------------------------------------------");
        answersOfStudents(allAnswers);
        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        System.out.println();
        rateStudents(answerKey,allAnswers);

    }

    private static void rateStudents(char[] answerKey, char[][] allAnswers) {

        for (int i = 0; i <allAnswers.length ; i++) {
            int numberOfCorrect=0;
            int numberOfFalse=0;
            for (int j = 0; j <allAnswers[i].length ; j++) {
                if (allAnswers[i][j]==answerKey[j]) {
                    numberOfCorrect++;
                }
                else {
                    numberOfFalse++;
                }
            }
            System.out.println((i+1)+". number of correct answer of student = "+numberOfCorrect);
            System.out.println("   number of wrong answer of student  = "+numberOfFalse);
            System.out.println();
        }
    }

    private static void CreateAnswerKey(char[] answerKey) {
        for (int i = 0; i <answerKey.length ; i++) {
            answerKey[i]=createRandomAnswer();
            System.out.print("  "+answerKey[i]);
        }
    }

    private static void answersOfStudents(char[][] allAnswers) {
        for (int i = 0; i <allAnswers.length ; i++) {
            System.out.println();
            System.out.print((i+1)+" answers of student :      "+"\t");
            for (int j = 0; j <allAnswers[i].length ; j++) {
                allAnswers[i][j]=createRandomAnswer();
                System.out.print("  "+allAnswers[i][j]);
            }

        }
    }

    public static char createRandomAnswer() {
        Random rastgele = new Random();
        return (char)(rastgele.nextInt(5)+ 'A');
        }
    }
