public class Pterodaktel extends Animal implements Flyable {
    public Pterodaktel() {
    }

    public Pterodaktel(String name, int age) {
        super(name, age);
    }

    @Override
    void go() {
        System.out.println("It runs");
    }

    @Override
    void feed() {
        System.out.println("It eats");
    }

    @Override
    public void fly() {
        System.out.println("It flies");
    }

    @Override
    public void landing() {
        System.out.println("It's landing");
    }
}
