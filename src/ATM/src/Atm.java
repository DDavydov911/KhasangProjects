public class Atm {
    private double moneyATM;
    private Card cardInside;

    public Atm(double moneyATM) {
        this.moneyATM = moneyATM;
    }

    public void setCardInside(Card card) {
        System.out.println("Attempt to insert card");
        if (!checkTheCard()) {
            this.cardInside = card;
            System.out.println("Card is inserted.");
        } else {
            System.out.println("The slot is busy");
        }
    }

    public void returnCard() {
        this.cardInside = null;
        System.out.println("Get your card.");
    }

    public void showCardBalance() {
        if (checkTheCard()) {
            if ("Credit".equals(cardInside.cardType)) {
                System.out.printf("%nThere are credit %.0f and %.0f allowed rubles at the card.",
                        cardInside.getCurrentCredit(), cardInside.getBalanceRub());
            } else {
                System.out.printf("%nThere are %.0f rubles at the card.",
                        cardInside.getBalanceRub());
            }
        } else {
            System.out.println("\nThere is no card inside.");
        }
    }

    public void getMoney(double sum) {
        if (checkTheCard()) {
            if (cardInside.getBalanceRub() < sum) {
                System.out.println("There are not enough money at the card.");
            } else if (moneyATM < sum) {
                System.out.println("There are not enough money at the ATM.");
            } else {
                moneyATM -= cardInside.getCardMoney(sum);
                System.out.println("Get your money: " + sum);
            }
        } else {
            System.out.println("There is no card inside.");
        }
    }

    public void addMoney(double sum) {
        if (checkTheCard()) {
            cardInside.addCardMoney(sum);
            System.out.printf("%n%.0f are added at the card", sum);
        }

    }

    boolean checkTheCard() {
        if (cardInside == null) {
            return false;
        }
        return true;
    }

}
