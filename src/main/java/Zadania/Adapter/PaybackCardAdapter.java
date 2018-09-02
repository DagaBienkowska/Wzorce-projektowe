package Zadania.Adapter;

public class PaybackCardAdapter implements CardAdapter {
    @Override
    public boolean take(float amount) {
        return new PaybackCard().payByPoints(amount);
    }
}
