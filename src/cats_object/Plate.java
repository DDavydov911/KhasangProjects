package cats_object;

public class Plate {
    int feed;
    int portion;
    Plate(int feed, int portion) {
        this.feed = feed;
        this.portion = portion;
    }
    void getFeed(Cat cat) {
        int reminder = 0;
        if (feed > portion) {
            feed -= portion;
            cat.consumedWater += portion;
            System.out.printf("%nТарелка покормила кошку %s на %d%n", cat.name, portion);
        } else if (feed > 0) {
            reminder = feed;
            cat.consumedWater += reminder;
            feed -= reminder;
            System.out.printf("%nТарелка покормила кошку %s на %d%n", cat.name, reminder);
        }
        System.out.printf("В тарелке осталось %d%n", feed);
        System.out.printf("Кошка всего съела %d%n", cat.consumedWater);
    }
    int getPortion() {
        if (feed > portion) {
            feed -= portion;
            System.out.printf("В тарелке осталось %d%n", feed);
            return portion;
        } else if (feed > 0) {
            int remainder = feed;
            System.out.printf("Последняя порция %d%n", remainder);
            feed = 0;
            return remainder;
        } else {
            System.out.println("Тарелка пуста пуста");
            return  0;
        }
    }
}
