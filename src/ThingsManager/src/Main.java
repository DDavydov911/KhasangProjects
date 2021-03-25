import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        ThingsManager thingsManager = new ThingsManager(count);
        Menu menu = new Menu(thingsManager);

        thingsManager.addThing(new Book("Библия", count, "Бог", 9785855244489L));
        thingsManager.addThing(new Book("Война и мир", count, "Лев Толстой", 9785389062566L));
        thingsManager.addThing(new Book("Гордость и предубеждение", count, "Джейн Остен", 9785926828143L));
        thingsManager.addThing(new Book("Собачье сердце", count, "Михаил Булгаков", 9785847511599L));
        thingsManager.addThing(new Book("1984", count,"Джордж Оруэлл",9785170801152L));
        thingsManager.addThing(new Book("Улисс", count,"Джеймс Джойс", 9785171113438L));
        thingsManager.addThing(new Book("Звук и ярость", count,"Уильям Фолкнер", 9785170946426L));
        thingsManager.addThing(new Book("Анна Каренина", count,"Лев Толстой", 9785699505906L));
        thingsManager.addThing(new Book("Финансист", count, "Теодор Драйзер",9785040975815L));
        thingsManager.addThing(new Book("Лолита", count,"Владимир Набоков",   9785389086357L));
        thingsManager.addThing(new Book("Горе от ума", count,"Александр Грибоедов", 9783743729995L));
        thingsManager.addThing(new Book("Java руководство для начинающих", count,"Герберт Шилдт", 9785845914408L));
        thingsManager.addThing(new Magnit("Маяк", count, "Ялта"));
        thingsManager.addThing(new Magnit( "Зоопарк", count, "Берлин"));
        thingsManager.addThing(new Clothes( "Пальто", count, 40));
        thingsManager.addThing(new Clothes("Куртка", count, 50));

        menu.showMenu();

//        Book book = new Book(count);
    }
}
