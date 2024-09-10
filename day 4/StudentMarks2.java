import java.util.Scanner;
public class StudentMarks2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[][] marks = new int[numStudents][4]; 
        int total=0;
        int totalmaths=0;
        int totalScience =0;
        int totaleng=0;
        int totalhis=0;

        for (int i = 0; i < numStudents; i++)
        {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Maths mark: ");
            marks[i][0] = input.nextInt(); 
            System.out.print("Science mark: ");
            marks[i][1] = input.nextInt();
            System.out.print("English mark: "); 
            marks[i][2]=input.nextInt();
            System.out.print("History mark: ");
            marks[i][3]=input.nextInt();
        }
        System.out.println("\nMarks for each student:");
        for (int i = 0; i < numStudents; i++) 
        {
            total+= marks[i][0]+marks[i][1]+marks[i][2]+marks[i][3];
            System.out.println("Student " + (i + 1) +(":average="+total/4));
            total=0;
        }
        for (int i = 0; i < numStudents; i++) 
        {
            totalmaths+= marks[i][0];
            totalScience+= marks[i][1];
            totaleng+=marks[i][2];
            totalhis+=marks[i][3];
        }
        System.out.println("Average of maths mark:"+(totalmaths/numStudents));
        System.out.println("Average of science mark:"+(totalScience/numStudents));
        System.out.println("Average of english mark:"+(totaleng/numStudents));
        System.out.println("Average of history mark:"+(totalhis/numStudents));
        
    }
}
