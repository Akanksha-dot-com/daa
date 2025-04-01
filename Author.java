import java.util.Scanner;

class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String toString() {
        return "Name of person is: " + this.firstName + " " + this.lastName;
    }
}

class Book {
    private Author author;
    private String title;
    private int priceOfBook;

    public Book(String title, Author author, int price) {
        this.title = title;
        this.author = author;
        this.priceOfBook = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.priceOfBook = price;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.priceOfBook;
    }

    public String toString() {
        return "The details of the book are: " + this.title + " by " + this.author.toString() + " with a price of " + this.priceOfBook;
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter author's first name:");
        String fn = scan.nextLine();
        System.out.println("Enter author's last name:");
        String ln = scan.nextLine();
        Author obj = new Author(fn, ln);
        System.out.println("Enter book title:");
        String t = scan.nextLine();
        System.out.println("Enter book price:");
        int p = Integer.parseInt(scan.nextLine());
        Book b = new Book(t, obj, p);
        System.out.println(b);
        scan.close();
    }
}
