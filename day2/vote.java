
import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your age: ");
        int a= input.nextInt();
        if(a>=18)
            System.out.println("you are eligible to vote");
        else
            System.out.println("you are not eligible to vote");
            

    }
    
}
