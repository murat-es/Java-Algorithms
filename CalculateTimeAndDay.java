import java.util.Scanner;

public class CalculateTimeAndDay {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("To calculate for hours --> 1\n" +
                "To calculate for days --> 2");
        int operation=input.nextInt();
        if (operation==2) {
            System.out.print("What day of the week today?  ");
            System.out.print("Please enter a value from 1 to 7. (eg 1 for Monday) ");
            int today = input.nextInt();
            while (1 > today || today > 7) {
                System.err.print("Please enter a value from 1 to 7. (eg 1 for Monday) ");
                today = input.nextInt();
            }
            System.out.print("How many days do you wonder the next day? ");
            int x = input.nextInt();

            String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

            int a = x % 7;
            today = (today + a) % 7;

            System.out.println(x + " days later it's " + days[today]);
        }
        else if (operation==1){
            System.out.println("What time is it now?");
            System.out.print("Enter the hour : ");
            int hour=input.nextInt();
            System.out.print("Enter the minute : ");
            int minute=input.nextInt();

            System.out.print("How many minutes would you like to calculate?");
            int calculate=input.nextInt();

            hour+=calculate/60;
            minute+=calculate%60;

            if (minute>59){
                hour+=1;
                minute=minute-60;
            }
            if (hour>23){
                hour=hour%24;
            }
            System.out.println("After "+calculate+" minutes, hour --> "+hour+":"+dakika);
        }
        else {
            System.err.println("You entered an invalid number. ");
            System.out.println("Exiting...");
        }
    }
}
