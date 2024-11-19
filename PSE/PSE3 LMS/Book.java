// Book.java
public class Book {
    private final int bookID;
    private String bookTitle;
    private String author;
    private boolean availabilityStatus;

    public Book(int bookID, String bookTitle, String author) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.author = author;
        this.availabilityStatus = true; // Default to available
    }

    public boolean isAvailable() {
        return availabilityStatus;
    }

    public void borrow() {
        if (availabilityStatus) {
            availabilityStatus = false;
            System.out.println(bookTitle + " has been borrowed.");
        } else {
            System.out.println(bookTitle + " is already borrowed.");
        }
    }

    public void returnBook() {
        availabilityStatus = true;
        System.out.println(bookTitle + " has been returned.");
    }

    public String getDetails() {
        return "Book ID: " + bookID + ", Title: " + bookTitle + ", Author: " + author + 
               ", Available: " + availabilityStatus;
    }
}
