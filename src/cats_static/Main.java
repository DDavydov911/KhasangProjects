package cats_static;

public class Main {
    public static void main(String[] args) {
        showHome();
        Cat cat1 = new Cat("Jul'ka");
        Cat cat2 = new Cat("Barsik");
        showHome();
        cat1.eat();
        cat2.drink();
        showHome();
        Cat cat3 = new Cat("Eater");
        cat3.drink();
        cat3.eat();
        cat3.drink();
        cat3.eat();
        showHome();
    }

    static void showHome() {
        System.out.printf("%nВ доме сейчас %d кошки(ек).%n", Cat.numberOfCats);
        System.out.printf("В тарелке сейчас %d гр. корма.%n", Cat.plate);
        System.out.printf("В миске сейчас %d мл. воды.%n", Cat.bowl);

    }
}
