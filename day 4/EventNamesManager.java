import java.util.Scanner;
public class EventNamesManager 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of attendees:");
        int num = scanner.nextInt();
        scanner.nextLine(); 
        String[] names = new String[num];
        
        System.out.println("Enter the names of " + num + " attendees:");
        for (int i = 0; i < num; i++) 
        {
            names[i] = scanner.next();
        }
        String longestName = names[0];
        for (String name : names) 
        {
            if (name.length() > longestName.length())
            {
                longestName = name;
            }
        }
        System.out.println("Longest Name: " + longestName);
        String shortestName = names[0];
        for (String name : names) 
        {
            if (name.length() < shortestName.length()) 
            {
                shortestName = name;
            }
        }
        System.out.println("Shortest Name: " + shortestName);
        System.out.println("Names in Reverse Order:");
        for (int i = names.length - 1; i >= 0; i--) 
        {
            System.out.println(names[i]+"  ");
        }

    }
}
