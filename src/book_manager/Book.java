package book_manager;

public class Book {
    String name;
    String author;
    int bookId;
    static int id = 0;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.bookId = ++id;
    }
    public String toString() {
        return "\"" + name + "\"" + " " + author + ", id: " + this.bookId;
    }

}
