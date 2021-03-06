package cats_object;

public class Cat {
    String name;
    int id;
    Bowl bowl;
    Plate plate;
    Home catsHome;

    Cat(Home home, String name, Bowl bowl, Plate plate) {
        this.name = name;
        this.bowl = bowl;
        this.plate = plate;
        this.id = ++home.countOfCats;
        System.out.printf("В доме появилась кошка %s, её id: %d%n%n", name, id);
    }

    void drink() {
        System.out.printf("Кошка(т) %s пьет%n%n", name);
        bowl.water -= 50;
    }
    void eat() {
        System.out.printf("Кошка(т) %s ест%n%n", name);
        plate.feed -= 70;
    }
}
