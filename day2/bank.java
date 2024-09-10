
import java.util.Scanner;

public class bank {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your current balance: ");
        int a= input.nextInt();
        System.out.print("Enter withdrawel amount: ");
        int b= input.nextInt();
        if(a>=b)
        {
            double c=a-b;
            System.out.print("Withdrawal successful. New balance:"+c);
        }
        else
            System.out.print("Insufficient balance");



    }
    
}
