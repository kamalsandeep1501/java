import java.util.Scanner;
public class studentscores {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number of student");
        int num = scanner.nextInt();
        int[] scores = new int[num];
        System.out.println("Enter the scores for"+ (num) +"students:");
        for (int i = 0; i < scores.length; i++) 
        {
            System.out.print("Score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
        int totalScore = 0;
        int highestScore = scores[0];
        int lowestScore = scores[0];
        for (int score : scores) 
        {
            totalScore += score;
            
            if (score > highestScore) 
            {
                highestScore = score;
            }
            
            if (score < lowestScore) 
            {
                lowestScore = score;
            }
        }
        double averageScore = (double) totalScore  / scores.length;
        System.out.println("\nScores:");
        for (int score : scores) 
        {
            System.out.println(score);
        }
        System.out.println("\nAverage Score: " + averageScore);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
    }




    
}
