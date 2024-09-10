
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter your mark");
        int a =input.nextInt();
        if(a>=90)
            System.out.println("Grage A");
        else if(a>=80 && a<90)
            System.out.println("Grade B");
        else if(a>=70 && a<80)
            System.out.println("Grade C");
        else if (a>=60 && a<70)
            System.err.println("Grade D");
        else 
            System.err.println("Grade F");

    }
    
}
