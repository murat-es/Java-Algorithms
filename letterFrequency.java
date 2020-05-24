import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Murat Eş
 */
// it is used to learn how many letters in the text

public class LetterFrequency {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the sentence : ");
        String sentence=input.nextLine();

        Map<Character,Integer> frekans= new TreeMap<>();

        for (int i = 0; i <sentence.length() ; i++) {
            char c=sentence.charAt(i);
            if (frekans.containsKey(c)){
                frekans.replace(c,frekans.get(c)+1);
            }
            else{
                frekans.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> entry : frekans.entrySet()) {
            System.out.println("Character : " +entry.getKey()+ " " + entry.getValue()+" times");
        }
    }
}

