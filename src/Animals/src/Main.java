public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Toshka", 2);
        Duck duck = new Duck("Kryak", 3);
        Flyable flyableDuck = duck;
        Herbivorous herbivorousDuck = duck;

        Cow cow = new Cow("Burenka", 5);
        Herbivorous herbivorousCow = cow;

        Pterodaktel ptero = new Pterodaktel("Ptero", 20);
        Flyable flyablePtero = ptero;

        Animal[] animals = new Animal[4];
        animals[0] = cat;
        animals[1] = duck;
        animals[2] = cow;
        animals[3] = ptero;
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        animals[0].sleep();
        animals[1].go();
        Flyable[] flies = new Flyable[4];
        flies[0] = duck;
        flies[1] = ptero;
        for (Flyable fly : flies) {
            System.out.println(fly);
        }
        flies[0].fly();
        flies[1].landing();

        Herbivorous[] herbs = new Herbivorous[4];
        herbs[0] = duck;
        herbs[1] = cow;
        for (Herbivorous herb : herbs) {
            System.out.println(herb);
        }
        herbs[0].eatGrass();
        

    }
}