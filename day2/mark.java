import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your mark");
        int a =input.nextInt();
        System.out.println((a>=50)?"pass":"fail");
    }
    
}
