// User.java
public abstract class User {
    protected String name;
    protected int age;
    protected int userID;

    public User(String name, int age, int userID) {
        this.name = name;
        this.age = age;
        this.userID = userID;
    }

    public abstract void borrowBook(Book book);

    public void returnBook(Book book) {
        book.returnBook();
    }
}
