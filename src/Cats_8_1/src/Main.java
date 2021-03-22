public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        Cat barsik = new Cat("Barsik", count);
        Cat muszik = new Cat("Murzik", count);
        Plate plate = new Plate();
        Bowl bowl = new Bowl();
        barsik.drink(bowl);
        muszik.eat(plate);
        bowl.showReminder();
        plate.showReminder();
    }
}
