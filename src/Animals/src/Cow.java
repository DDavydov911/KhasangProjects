public class Cow extends Animal implements Herbivorous{

    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    void go() {
        System.out.println("Cow goes");
    }

    @Override
    void feed() {
        System.out.println("Cow eats feed");
    }

    @Override
    public void eatGrass() {
        System.out.println("Cow eats GRASS");
    }
}
