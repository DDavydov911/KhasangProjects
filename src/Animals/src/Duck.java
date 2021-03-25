public class Duck extends Animal implements Flyable, Herbivorous{

    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    void go() {
        System.out.println("Duck goes on the ground");
    }

    @Override
    void feed() {
        System.out.println("Duck eats feed");
    }

    @Override
    public void fly() {
        System.out.println("Duck flies");
    }

    @Override
    public void landing() {
        System.out.println("Duck is landing");
    }

    @Override
    public void eatGrass() {
        System.out.println("Duck eats GRASS");
    }
}
