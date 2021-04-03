public class MasterCard extends Card{
    public MasterCard(long cardNumber, String cardHolderName) {
        super(cardNumber, cardHolderName);
        this.paymentSystem = "Master Card";
        System.out.printf("%nCard %s %s is created.", paymentSystem, cardType);
    }

    @Override
    public double getCurrentCredit() {
        return 0;
    }
}
