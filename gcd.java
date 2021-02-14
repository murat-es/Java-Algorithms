import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers you want to find GCD");
        System.out.print("Number 1 : ");
        int number1= input.nextInt();
        System.out.print("Number 2 : ");
        int number2= input.nextInt();

        int gcd=1;
        int small = Math.min(number1,number2);

        for (int i = 1; i <=small ; i++) {
            if(number1%i==0 && number2%i==0){
                gcd=i;
            }
        }
        if (gcd==1){
            System.out.println(number1+" and "+number2+ " are relatively prime.");
        }
        else {
            System.out.println("GCD of "+number1 + " and "+ number2 + " = "+gcd);
        }
    }
}