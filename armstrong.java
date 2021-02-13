import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) { //
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number= input.nextInt();
        System.out.print("How many digits is your number  ? : ");
        int digit= input.nextInt();

        int temp=number;
        int total=0;

        do {
            int valueOfDigit=temp%10;
            temp/=10;
            total+=Math.pow(valueOfDigit,digit);
        }while (temp>0);

        if(number==total){
            System.out.println("It is an armstrong number");
        }else {
            System.out.println("It is not an armstrong number ");
        }
    }
}
