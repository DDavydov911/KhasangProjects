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
            cat.consumedFeed += portion;
            System.out.println("Тарелка покормила кошку на " + portion);
        } else if (feed > 0) {
            reminder = feed;
            cat.consumedFeed += reminder;
            feed -= reminder;
            System.out.println("Тарелка покормила кошку на " + reminder);
        }
        System.out.println("В тарелке осталось " + feed);
        System.out.println("Кошка всего съела " + cat.consumedFeed);
    }
    int getPortion() {
        if (feed > portion) {
            feed -= portion;
            System.out.println("В тарелке осталось " + feed);
            return portion;
        } else if (feed > 0) {
            int remainder = feed;
            System.out.println("Последняя порция " + remainder);
            feed = 0;
            return remainder;
        } else {
            System.out.println("Тарелка пуста пуста");
            return  0;
        }
    }
}
