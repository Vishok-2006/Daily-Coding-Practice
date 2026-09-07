class Book {
    private int id;
    private String title;
    private boolean available;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

abstract class User {
    protected String name;

    User(String name) {
        this.name = name;
    }

    abstract void borrowBook(Book book);

    abstract void returnBook(Book book);
}

class Student extends User {

    Student(String name) {
        super(name);
    }

    @Override
    void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book is not available.");
        }
    }

    @Override
    void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println(name + " returned " + book.getTitle());
    }
}

public class ooppractice {

    public static void main(String[] args) {

        Book book = new Book(1, "Java Programming");

        User student = new Student("Vishok");

        student.borrowBook(book);
        student.returnBook(book);
    }
}