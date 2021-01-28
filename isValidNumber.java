import java.util.Scanner;

public class ValidNumber{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("******** IS VALID NUMBER OR NOT ********");
        System.out.print("Please enter a number: ");
        int number=scanner.nextInt();

        int i=1;
        int sumOfDivisors=0;
        while (i<number){
            if (number%i==0)
                sumOfDivisors+=i;
            i++;
        }

        if (number==sumOfDivisors){
            System.out.println(number+" is a valid number.");
        } else {
            System.out.println(number+" is not a valid number.");
        }
    }
}