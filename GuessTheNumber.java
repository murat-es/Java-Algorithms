import java.util.Scanner;

public class GuessTheNumber { 
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int random = (int)(Math.random()*100);
        int number=0;
        int trying=0;
        System.out.print("Please enter the number : ");

        while (random!=number) {
            number=input.nextInt();
            if (number<random){
                System.out.print("increase the number  :\t ");
            }
            if (number>random){
                System.out.print("decrease the number :\t ");
            }
            trying++;
        }
        System.out.println("Congratulations! You found the number in the "+trying+"th trying :)");
    }
}
