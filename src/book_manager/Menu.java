package book_manager;

import java.util.Scanner;

public class Menu {
    BookManager bookManager;
    Scanner scanner = new Scanner(System.in);

    Menu(BookManager bk) {
        this.bookManager = bk;
    }

    public void showMenu() {
        int choose = 5;
        do {
            System.out.println("Выберите, пункт меню");
            System.out.println("1. Показать перечень всех книг");
            System.out.println("2. Добавить книгу");
            System.out.println("3. Показать информацию о книге");
            System.out.println("4. Удалить книгу");
            System.out.println("5. Выйти");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    bookManager.showAllBooks();
                    break;
                case 2:
                    createNewBook();
                    break;
                case 3:
                    showBookInfo();// не работает!!!
                    break;
                case 4:
                    removeBookById();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Выберите один из пунктов: ");
                    break;
            }
        } while (choose != 5);
    }

    private void showBookInfo() {
        System.out.println("Введите id книги, информацию о которой хотите посмотреть");
        int id = scanner.nextInt();
        scanner.nextLine();
        bookManager.showBookInfo(id);
    }

    public void createNewBook() {
        System.out.println("Введите название новой книги\n_");
        String bookName = scanner.nextLine();
        System.out.println("Введите автора новой книги\n_");
        String bookAuthor = scanner.nextLine();
        bookManager.addBook(new Book(bookName, bookAuthor));
    }

    public void removeBookById() {
        System.out.println("Введите id книги, которую нужно удалить");
        int id = scanner.nextInt();
        scanner.nextLine();
        bookManager.removeBookById(id);
    }
}
