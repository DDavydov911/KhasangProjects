public class Bowl {
    private int waterAmount;
    private int portion;

    public Bowl() {
        this.waterAmount = 200;
        this.portion = 30;
    }

    public int getPortion() {
        if (waterAmount > portion) {
            waterAmount -= portion;
            return portion;
        }
        if (waterAmount > 0) {
            int reminder = waterAmount;
            waterAmount = 0;
            return reminder;
        }
        System.out.println("Миска пуста");
        return 0;
    }

    public void  showReminder() {
        System.out.printf("%nВ миске осталось %d воды%n", waterAmount);
    }
}
