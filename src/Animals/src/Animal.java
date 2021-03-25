public abstract class Animal {
    String name;
    int age;

    Animal(){

    }
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void sleep() {
        System.out.println("I am sleeping");
    }

    abstract void go();

    abstract void feed();

    @Override
    public String toString() {
        return "name: " + name + " age: " + age;
    }
}