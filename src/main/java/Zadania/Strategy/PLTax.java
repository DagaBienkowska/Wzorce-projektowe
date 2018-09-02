package Zadania.Strategy;

public class PLTax implements TaxStrategy {
    @Override
    public Float calculate(Float income) {
        float tax = 0;
        if (income > 50000){
            tax = income * 0.19f;
            return tax;
        }
        if (income > 100000){
            tax = income * 0.30f;
            return tax;
        }
        return tax = income * 0.1f;
    }
}
