import java.util.Scanner;

public class StudentBioData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your grade level: ");
        double mark = scanner.nextDouble();

        System.out.println("Student Bio Data:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade Level: " + mark);

        scanner.close();
    }
}