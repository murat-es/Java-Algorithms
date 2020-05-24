import java.util.Scanner;

public class IsPalindrome { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the word : ");
        String word =input.nextLine();

        int lowerBound=0;
        int upperBound=word.length()-1;

        boolean isPalindrome=true;

        while (lowerBound<upperBound) {
            if(word.charAt(lowerBound)!=word.charAt(upperBound)) {
                isPalindrome=false;
                break;
            }
            lowerBound++;
            upperBound--;
        }
        if (isPalindrome) {
            System.out.println("'"+word+"' is a palindrome.");
        }
        else {
            System.out.println("'"+word+"' is not a palindrome.");
        }
    }
}
