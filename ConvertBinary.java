import java.util.Scanner;

/**
 * @author Murat Eş
 */

public class ConvertBinary { //convert decimal system to binary format
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("please enter the number you want to convert : ");
        int number= input.nextInt();

        StringBuilder binary= new StringBuilder();
        if (number==0) {
            binary = new StringBuilder("0");
        }
        while (number>0) {
            int mode = number%2;
                binary.insert(0, mode);
                number=number/2;
        }
        System.out.println("binary digit : "+binary);
    }
}
