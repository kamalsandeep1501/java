import java.util.Scanner;

public class Library 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of books: ");

            System.out.print("Enter the book title: ");
            String title = scanner.nextLine();

            System.out.print("Enter the book author: ");
            String author = scanner.nextLine();

            System.out.print("Enter the book price: $");
            int cost = scanner.nextInt();

            System.out.print("Enter the number of copies available: ");
            int copies = scanner.nextInt();
            scanner.nextLine(); 

            Book obj = new Book(title,author,cost,copies);

        obj.display();
        
    }
}

class Book {
    private  String title;
    private  String author;
    private int cost;
    private int copies;

    public Book(String title, String author, int cost, int copies) {
        this.title = title;
        this.author = author;
        this.cost = cost;
        this.copies = copies;
    }

    public   void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: $" + cost);
        System.out.println("Copies Available: " + copies);
    }
}
