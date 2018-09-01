package rozgrzewka;

public class Money {

    enum CURRENCY{
        PLN(5),
        USD(1),
        EUR(2);

        private float value;
        CURRENCY(float value){
            this.value = value;
        }
    }
    private CURRENCY currency;
    private float amount;

    public Money(CURRENCY currency, float amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public CURRENCY getCurrency() {
        return currency;
    }

    public float getAmount() {
        return amount;
    }


}
