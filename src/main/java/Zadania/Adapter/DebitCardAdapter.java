package Zadania.Adapter;

public class DebitCardAdapter implements CardAdapter {
    @Override
    public boolean take(float amount) {
        return new DebitCard().takeMoney(amount);
    }
}
