package cats_object;

public class Main {
    public static void main(String[] args) {
        Home catsHome = new Home();
        Bowl bigBowl = new Bowl(400, 50);
        Bowl smallBowl = new Bowl(200, 50);
        Plate bigPlate = new Plate(500, 70);
        Plate smallPlate = new Plate(250, 70);
        catsHome.bowl = bigBowl;
        catsHome.bowl2 = smallBowl;
        catsHome.plate = bigPlate;
        catsHome.plate2 = smallPlate;
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
        cat2.drink(smallBowl);
        cat1.eat(smallPlate);
        cat3.eat(smallPlate);
        cat3.drink(smallBowl);
        catsHome.showHome();
    }


}
