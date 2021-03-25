public class Cat extends Pet{

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void go() {
        System.out.println("Cat runs");
    }

    @Override
    void feed() {
        System.out.println("Cat eats something");
    }

}
