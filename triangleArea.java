import java.util.Scanner;
public class CalculateArea;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the edges of triangle:");

        System.out.print("a : ");
        double a=scanner.nextInt();
        System.out.print("b : ");
        double b=scanner.nextInt();
        System.out.print("c : ");
        double c=scanner.nextInt();

        if (a<0 || b<0 || c<0){
            System.err.println("You entered the nonpositive value as a edge!");
            System.exit(0); // also instead of this can write 'return;'
        }
        if (a>b+c || b>a+c || c>a+b){
            System.err.println("It is not a valid triangle!");
            System.exit(0);  // also instead of this can write 'return;'
        }
        double u=(a+b+c)/2;
        double area=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("The area of triangle : "+area);
    }
}