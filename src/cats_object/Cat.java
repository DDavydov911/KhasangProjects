package cats_object;

public class Cat {
    String name;
    int id;
    Bowl bowl;
    int consumedWater;
    Plate plate;
    Home catsHome;


    Cat(Home home, String name, Bowl bowl, Plate plate) {
        this.name = name;
        this.bowl = bowl;
        this.plate = plate;
        this.catsHome = home;
        this.id = ++catsHome.countOfCats;
        consumedWater = 0;
        System.out.printf("В доме появилась кошка %s, её id: %d%n%n", name, id);
    }
    void drink() {
        System.out.printf("Кошка(т) %s пьет%n%n", name);
        bowl.water -= bowl.portion;
        consumedWater += bowl.portion;
    }

    void drink(Bowl newBowl) {
        System.out.printf("Кошка(т) %s пьет%n%n", name);
        consumedWater += newBowl.getPortion();
    }
    void eat() {
        System.out.printf("Кошка(т) %s ест%n%n", name);
        plate.feed -= plate.portion;
        consumedWater += plate.portion;
    }
    void eat(Plate newPlate) {
        System.out.printf("Кошка(т) %s ест%n%n", name);
        consumedWater += newPlate.getPortion();;
    }
}
