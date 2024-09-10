
import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ram = new Random();
        while (true) 
        { 
           System.out.println("welcome to guessing game"); 
           System.out.println("I have selected a number between 1 and 100.");
           System.out.println("Can you guess what it is?");
           System.out.print("enter your guess: ");
           int x = ram.nextInt(100);
           int a=input.nextInt();
           if(a<x)
           {
            System.out.println("Too low");
           }
           else if(a>x)
           {
            System.out.println("Too high");
           }
           else if(a==x)
           {
            System.out.println("Congratulations! You guessed the correct number!");
            break;
           }
        }

    }
    
}
