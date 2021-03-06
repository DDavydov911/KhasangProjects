package cats_object;

public class Home {
    int countOfCats;
    Bowl bowl;
    Plate plate;

    void addWater() {
        bowl.water = 400;
    }
    void addFeed() {
        plate.feed = 500;
    }
    void showHome() {
        System.out.printf("В доме сейчас %d кошек(ки)%n", countOfCats);
        System.out.printf("В миске сейчас %d мл. воды%n", bowl.water);
        System.out.printf("В чашке сейчас %d гр. корма%n%n", plate.feed);
    }
}
