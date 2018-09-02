package Zadania.Adapter;

public class PaybackCard {

    float points = 10000;

    public boolean payByPoints(float amount){
        return amount <= points;
    }

}
