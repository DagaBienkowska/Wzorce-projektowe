package Zadania.Adapter;

public class DebitCard{

    float accountFunds = 10000;

    public boolean takeMoney(float amount){
       return amount <= accountFunds;
    }

}
