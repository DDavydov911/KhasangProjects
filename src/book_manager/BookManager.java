package book_manager;

import java.util.ArrayList;

public class BookManager {
    ArrayList<Book> library;

    BookManager() {
        library = new ArrayList<>();
    }

    public void addBook(Book book) {
        library.add(book);
        System.out.printf("Книга %s %s добавлена в библиотеку, её id: %d%n", book.name, book.author, book.bookId);
    }

    public  void removeBookById(int id) {
        if (id == -1) {
            System.out.println("Книги с таким id  в библиотеке нет");
        } else {
            System.out.printf("Книга %s %s удалена из библиотеки%n", library.get(getBookIndexById(id)).name,
                    library.get(getBookIndexById(id)).author);
            library.remove(getBookIndexById(id));
        }
    }

    public void showAllBooks() {
        for (Book book: library) {
            System.out.println(book);
        }
    }

    public void showBookInfo(int id) {//не работает
        if (getBookIndexById(id) == -1) {
            System.out.println("Книги с таким id в библиотеке нет\n");
            return;
        }
        System.out.println(library.get(getBookIndexById(id)) + "\n");
    }

    public int getBookIndexById(int id) {
        int index = -1;
        for (int i = 0; i < library.size(); i++) {
            if ( library.get(i).bookId == id) {
                index = i;
            }
        }
        return index;
    }
}
