package cats_object;

public class Home {
    int countOfCats;
    Bowl bowl;
    Bowl bowl2;
    Plate plate;
    Plate plate2;

    void addWater() {
        bowl.water = 400;
    }
    void addFeed() {
        plate.feed = 500;
    }
    void showHome() {
        System.out.printf("В доме сейчас %d кошек(ки)%n", countOfCats);
        System.out.printf("В 1-й миске сейчас %d мл. воды, во 2-й %d.%n", bowl.water, bowl2.water);
        System.out.printf("В 1-й чашке сейчас %d гр. корма, во 2-й %d.%n%n", plate.feed, plate2.feed);
    }
}
