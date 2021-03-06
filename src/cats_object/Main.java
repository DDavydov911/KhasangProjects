package cats_object;

public class Main {
    public static void main(String[] args) {
        Home catsHome = new Home();
        Bowl bigBowl = new Bowl(400);
        Plate bigPlate = new Plate(500);
        catsHome.bowl = bigBowl;
        catsHome.plate = bigPlate;
        catsHome.showHome();
        Cat cat1 = new Cat(catsHome, "Kuzya", bigBowl, bigPlate);
        catsHome.showHome();
        Cat cat2 = new Cat(catsHome, "Murzik", bigBowl, bigPlate);
        Cat cat3 = new Cat(catsHome, "Yershik", bigBowl, bigPlate);
        cat1.eat();
        cat1.drink();
        catsHome.showHome();
        cat2.drink();
        cat3.eat();
        cat3.drink();
        catsHome.showHome();
    }


}
