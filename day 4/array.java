
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a number of student");
        int row = input.nextInt();
        System.out.println("Enter the number of subject");
        int col = input.nextInt();
        int[][]num=new int[row][col];
        int total1=0;
        int total2=0;
        for(int i=0;i<row;i++)
        {
            System.out.println("student :"+(i+1));
            System.out.println("Enter mark");
            for(int j=0;j<col;j++)
            {
                
                num[i][j]=input.nextInt();
            }
        }
        System.out.println("student mark");
        for(int j=0;j<col;j++)
        {
            for(int i=0;i<1;i++)
            {

                total1+=num[i][j];
            }
           
            

           
        }
        System.out.print("total mark of student 1:  "+total1+"\n");
        for(int j=0;j<col;j++)
        {
            for(int i=1;i<2;i++)
            {

                total2+=num[i][j];
            }
           
            

        }
        System.out.print("total mark of student 2: "+ total2); 
        
        
    }
    
}
