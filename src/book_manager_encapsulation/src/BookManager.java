import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    private ArrayList<Book> library; //Правильно ли объявлять ArrayList как private?
    private Scanner scanner;
    public Count count;

    public BookManager(Count count) {
        this.library = new ArrayList<Book>();
        this.count = count;
        scanner = new Scanner(System.in);
    }

    private int getBookIndexById(int id) {
        int index = -1;
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getId() == id) {
                index = i;
            }
        }
        return index;
    }

    public void addBook(Book aBook) {
        library.add(aBook);
        System.out.printf("%nКнига %s %s добавлена в библиотеку, её id: %d",
                aBook.getName(), aBook.getAuthor(), aBook.getId());
    }

    public void removeBookById() {
        System.out.println("Введите id  книги, которую Вы хотите удалить\n_");
        int id = scanner.nextInt();
        scanner.nextLine();
        int index = getBookIndexById(id);
        if (index == -1) {
            System.out.println("Книги с таким id  в библиотеке нет");
        } else {
            System.out.printf("Книга %s %s удалена из библиотеки%n", library.get(index).getName(),
                    library.get(index).getAuthor());
            library.remove(index);
        }
    }

    public void showBookInfoById() {
        System.out.println("Введите id книги, информацию о которой хотите посмотреть\n_");
        int id = scanner.nextInt();
        scanner.nextLine();
        int index = getBookIndexById(id);
        if (index == -1) {
            System.out.println("Книги с таким id в библиотеке нет");
            return;
        }
        System.out.println(library.get(index));
    }

    public void showAllBooks() {
        for (Book book : library) {
            System.out.println(book);
        }
    }

    public void createNewBook() {
        System.out.println("Введите название новой книги\n_");
        String newBookName = scanner.nextLine();
        System.out.println("Введите автора новой книги\n_");
        String newBookAuthor = scanner.nextLine();
        addBook(new Book(newBookName, newBookAuthor, count));
    }

}
