package Zadania.Strategy;

public class USATax implements TaxStrategy {
    @Override
    public Float calculate(Float income) {
        float tax = 0;
        return tax = income * 0.40f;
    }
}
