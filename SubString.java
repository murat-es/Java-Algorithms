import java.util.Scanner;
/**
 * @author Murat Eş
 */
public class SubString { //let's code the substring method ourselves.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the word : ");
        String word=input.nextLine();
        System.out.println("Please enter the interval (ex:murat --> interval 1 and 4 --> 'ura' )");
        int a=input.nextInt();
        int b=input.nextInt();

        System.out.println(ourSubstring(word,a,b));
        System.out.println(word.substring(a,b));
    }

    public static String ourSubstring(String word, int a, int b) {
        StringBuilder result = new StringBuilder();
        while (a < b) {
            result.append(word.charAt(a));
            a++;
        }
        return result.toString();
    }
}
