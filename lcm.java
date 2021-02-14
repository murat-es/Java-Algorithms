import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers you want to find LCM");
        System.out.print("Number 1 : ");
        int number1= input.nextInt();
        System.out.print("Number 2 : ");
        int number2= input.nextInt();

        System.out.println("LCM of numbers : " +findLCM(number1,number2));
    }

    private static int findLCM(int number1, int number2) {
        int big =Math.max(number1,number2); // min veya max yazmanın sonucu neden değiştirmediğini düşün
        int lcm=0;

        for (int i = big; i <=number1*number2 ; i++) {
            if (i%number1==0 && i%number2==0 ){
                lcm=i;
                break;
            }
        }
        return lcm;
    }
}