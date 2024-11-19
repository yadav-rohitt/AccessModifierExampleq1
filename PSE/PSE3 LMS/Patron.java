// Patron.java
public class Patron extends User {

    public Patron(String name, int age, int userID) {
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
}
