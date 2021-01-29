import java.util.Arrays;

public class Split{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(split("Mu-ra-t-ES", '-')));

    }
    public static String[] split(String string,char regex){
        boolean isContainRegex=false;
        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i)==regex){
                isContainRegex=true;
                break;
            }
        }
        if (!isContainRegex){
            System.err.println("Char not found");
            return null;
        }

        int count=0;
        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i)==regex){
                count++;
            }
        }
        String[] array=new String[count+1];
        count=0;

        String element="";
        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i)==regex){

                array[count]=element;
                element="";
                count++;
                continue;
            }
            element+=string.charAt(i);
        }
        array[count]=element;

        return array;
    }
}
