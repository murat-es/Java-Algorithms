import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Starting number: ");
        int start=scanner.nextInt();
        System.out.print("Ending number: ");
        int end=scanner.nextInt();

        if (end==start){
            throw new ArithmeticException("Starting number and ending number are not be equal!");
        }

        System.out.print("Increment: ");
        int step=scanner.nextInt();

        if (start<end){
            if (step<=0){
                throw new ArithmeticException("Increment must be positive if ending number is bigger than starting number");
            }
            for (int i = start; i <=end ; i+=step) {
                System.out.println(i);
            }
        }
        else {
            if (step>=0){
                throw new ArithmeticException("Increment must be negative if starting number is bigger than ending number");
            }
            for (int i = start; i >=end ; i+=step) {
                System.out.println(i);
            }
        }
    }
}