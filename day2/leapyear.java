
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a year: ");
        int a = input.nextInt();
        if(a%4==0)
        {
            System.out.print(a+ " is a leap year");
        }
        else if(a%100==0)
        { 
            System.out.print(a+ " not a leap year");
        }
        else if(a%400==0)
        {
            System.out.print(a+ " is a leap year");
        }
        else 
        {
            System.out.print(a+ " not a leap year");
        }
    }
    
}
