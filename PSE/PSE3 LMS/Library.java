// Library.java
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book.getDetails());
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("Added User: " + user.name);
    }

    public void listBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            System.out.println(book.getDetails());
        }
    }

    public void listUsers() {
        System.out.println("Users in Library:");
        for (User user : users) {
            System.out.println("Name: " + user.name + ", User ID: " + user.userID);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        Book book1 = new Book(101, "Java Programming", "James Gosling");
        Book book2 = new Book(102, "Python for Data Science", "Guido van Rossum");
        library.addBook(book1);
        library.addBook(book2);

        // Add users
        Patron patron = new Patron("Alice", 25, 1);
        Librarian librarian = new Librarian("Bob", 40, 2);
        library.addUser(patron);
        library.addUser(librarian);

        // List books and users
        library.listBooks();
        library.listUsers();

        // Borrow and return books
        patron.borrowBook(book1);
        librarian.borrowBook(book2);
        librarian.returnBook(book2);

        // Generate reports
        librarian.generateBookReport();
        librarian.generateUserReport();
    }
}

