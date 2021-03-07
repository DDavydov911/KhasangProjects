package cats_object;

public class Bowl {
    int water;
    int portion;
    Bowl(int water, int portion) {
        this.water = water;
        this.portion = portion;
    }
    void getWater(Cat cat) {
        cat.consumedFeed += portion;
        water -= portion;
        System.out.println("Миска напоила кошку на " + portion);
        System.out.println("В миске осталось " + water);
        System.out.println("Кошка всего выпила " + cat.consumedWater);
    }
    int getPortion() {
        if (water > portion) {
            water -= portion;
            System.out.println("В миске осталось " + water);
            return portion;
        } else if (water > 0) {
            int remainder = water;
            System.out.println("Последняя порция " + remainder);
            water = 0;
            return remainder;
        } else {
            System.out.println("Миска пуста");
            return  0;
        }
    }
}
