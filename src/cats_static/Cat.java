package cats_static;

public class Cat {
    public static int numberOfCats;
    public static int plate = 300;
    public  static int bowl = 250;
    int id;
    String name;

    Cat(String name) {
        this.name = name;
        this.id = ++numberOfCats;
        System.out.printf("В доме появилаль кошка %s, её id %d%n", name, id);
    }
    void eat() {
        plate -= 70;
    }
    void drink() {
        bowl -= 50;
    }
}
