import java.util.Scanner;

public class Menu {
    public BookManager bookManager;
    private Scanner scanner;

    public Menu(BookManager bookManager) {
        this.bookManager = bookManager;
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        int choose = 5;
        do {
            System.out.println("\n\nВыберите, пункт меню");
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
                    bookManager.createNewBook();
                    break;
                case 3:
                    bookManager.showBookInfoById();
                    break;
                case 4:
                    bookManager.removeBookById();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Выберите один из пунктов: ");
                    break;
            }
        } while (choose != 5);
    }

}
