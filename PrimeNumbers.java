import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) { 
        Scanner input= new Scanner(System.in);

        System.out.println("up to what number would you like to find?");
        int number=input.nextInt();

        for (int i = 2; i <=number ; i++) {
            boolean isPrime=true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime)
            System.out.println(i);
        }
    }
}
