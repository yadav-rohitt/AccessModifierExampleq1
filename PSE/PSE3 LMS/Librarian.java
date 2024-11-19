// Librarian.java
public class Librarian extends User implements ReportGenerator {

    public Librarian(String name, int age, int userID) {
        super(name, age, userID);
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrow();
        } else {
            System.out.println("Sorry, " + book.getDetails() + " is unavailable.");
        }
    }

    @Override
    public void generateBookReport() {
        System.out.println("Books Report: Display all book details here.");
    }

    @Override
    public void generateUserReport() {
        System.out.println("Users Report: Display all user details here.");
    }
}
