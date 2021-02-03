import java.util.Scanner;

public class Encrypt{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the word that will encrypt: ");
        String message=scanner.nextLine();
        System.out.println("Encrypted: "+encrypt(message));
    }
    public static String encrypt(String message){
        if (message.length()%2!=0){
            String space=" ";
            message+=space;
        }

        String encryptMessage="";
        for (int i = 0; i <message.length(); i+=2) {
            char temp1=message.charAt(i);
            char temp2=message.charAt(i+1);

            encryptMessage+=temp2;
            encryptMessage+=temp1;
        }
        return encryptMessage;
    }
}