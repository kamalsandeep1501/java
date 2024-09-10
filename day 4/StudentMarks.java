import java.util.Scanner;
public class StudentMarks 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[][] marks = new int[numStudents][2]; 
        int total=0;
        int totalmaths=0;
        int totalScience =0;
        for (int i = 0; i < numStudents; i++)
        {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Maths mark: ");
            marks[i][0] = input.nextInt(); 
            System.out.print("Science mark: ");
            marks[i][1] = input.nextInt(); 
        }
        System.out.println("\nMarks for each student:");
        for (int i = 0; i < numStudents; i++) 
        {
            System.out.println("Student " + (i + 1) + ": Maths = " + marks[i][0] + ", Science = " + marks[i][1]);
            total+= marks[i][0]+marks[i][1];
            totalmaths+= marks[i][0];
            totalScience+= marks[i][1];

        }
        System.out.println("Average of mark: "+((double)total/numStudents));
        System.out.println("Average of maths mark: "+((double)totalmaths/numStudents));
        System.out.println("Average of science mark: "+((double)totalScience/numStudents));
        
    }
}
