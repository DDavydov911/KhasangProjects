package book_manager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Библия", "Бог");
        Book book2 = new Book("Война и мир", "Лев Толстой");
        Book book3 = new Book("Гордость и предубеждение", "Джейн Остен");
        Book book4 = new Book("Собачье сердце", "Михаил Булгаков");
        Book book5 = new Book("1984", "Джордж Оруэлл");
        Book book6 = new Book("Улисс", "Джеймс Джойс");
        Book book7 = new Book("Звук и ярость", "Уильям Фолкнер");
        Book book8 = new Book("Анна Каренина", "Лев Толстой");
        Book book9 = new Book("Финансист", "Теодор Драйзер");
        Book book10 = new Book("Лолита", "Владимир Набоков");
        BookManager bk = new BookManager();
        bk.addBook(book1);
        bk.addBook(book2);
        bk.addBook(book3);
        bk.addBook(book4);
        bk.addBook(book5);
        bk.addBook(book6);
        bk.addBook(book7);
        bk.addBook(book8);
        bk.addBook(book9);
        bk.addBook(book10);
        Menu menu = new Menu(bk);
        menu.showMenu();
    }
}
