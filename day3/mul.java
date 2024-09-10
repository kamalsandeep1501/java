import java.util.Random;
import java.util.Scanner;
public class mul{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    Random ram=new Random();
    while (true)
    {
    System.out.println("Welcome to the Multiplication Practice Program!");
    int x= ram.nextInt(10)+1;
    int y= ram.nextInt(10)+1;
    System.out.print("what is "+ x +"*"+y);
    int ans= x*y;
    System.out.println("Enter your answer (or 0 to exit)");
    int a=input.nextInt();
    if (ans==a)
    {
        System.out.println("correct!");
    }
    else if(a==0)
    {
        System.out.println("Thank you for practicing multiplication!");
        break;
    }
    else
    {
        System.out.println("Incorrect:the correct answer is"+ans);
    }
    }
}
}
