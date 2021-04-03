public class VisaCard extends CreditCard {
    public VisaCard(long cardNumber, String cardHolderName, double creditLimit) {
        super(cardNumber, cardHolderName, creditLimit);
        this.paymentSystem = "Visa";
        System.out.printf("%nCard %s %s is created.", paymentSystem, cardType);
    }

    @Override
    public double getCurrentCredit() {
        return super.getCurrentCredit();
    }
}
