import java.util.Scanner;

public class PrintX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int line= input.nextInt();

        for (int i = 0; i <line ; i++) {
            for (int j = 0; j <line ; j++) {
                if(i==j || j==line-i-1) {
                    System.out.print("x");
                }
                else {
                    if (line==line/2+1){
                        System.out.println("");
                    }
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
    }
}
