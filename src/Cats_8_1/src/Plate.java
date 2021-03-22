public class Plate {
    private int feedAmount;
    private int portion;

    public Plate() {
        this.feedAmount = 300;
        this.portion = 40;
    }

    public int getPortion() {
        if (feedAmount > portion) {
            feedAmount -= portion;
            return portion;
        }
        if (feedAmount > 0) {
            int reminder = feedAmount;
            feedAmount = 0;
            return reminder;
        }
        System.out.println("Тарелка пуста");
        return 0;
    }

    public void  showReminder(){
        System.out.printf("%nВ тарелке осталось %d еды%n", feedAmount);
    }
}
