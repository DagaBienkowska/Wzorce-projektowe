package rozgrzewka;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Money " +currency +
                " amount " +amount;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Money){
            Money moneyToEqual = (Money) o;
            return moneyToEqual.getCurrency().equals(this.getCurrency()) &&
                    moneyToEqual.getAmount() == this.getAmount();
            }
        return false;
    }


}
