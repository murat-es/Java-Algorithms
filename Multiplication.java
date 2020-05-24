import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number you want to multiply and type 0 to finish.");

        int numbers=1;
        int multiplying=1;

        while (numbers!=0) {
            numbers = input.nextInt();
            if (numbers>0) {
                multiplying *= numbers;
            }
        }
        System.out.println("Result : "+multiplying);
    }
}
