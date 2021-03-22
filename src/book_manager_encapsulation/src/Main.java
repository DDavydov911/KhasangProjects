public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        BookManager bookManager = new BookManager(count);
        Menu menu = new Menu(bookManager);
        bookManager.addBook(new Book("Библия", "Бог", count));
        bookManager.addBook(new Book("Война и мир", "Лев Толстой", count));
        bookManager.addBook(new Book("Гордость и предубеждение", "Джейн Остен", count));
        bookManager.addBook(new Book("Собачье сердце", "Михаил Булгаков", count));
        bookManager.addBook(new Book("1984", "Джордж Оруэлл", count));
        bookManager.addBook(new Book("Улисс", "Джеймс Джойс", count));
        bookManager.addBook(new Book("Звук и ярость", "Уильям Фолкнер", count));
        bookManager.addBook(new Book("Анна Каренина", "Лев Толстой", count));
        bookManager.addBook(new Book("Финансист", "Теодор Драйзер", count));
        bookManager.addBook(new Book("Лолита", "Владимир Набоков", count));
        menu.showMenu();
    }
}
