public class Book {
    private final String name;
    private final String author;
    private final int id;

    public Book(String name, String author, Count count) {
        this.name = name;
        this.author = author;
        this.id = count.getCount();
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\"" + name + "\"" + " " + author + ", id: " + id;
    }
}
