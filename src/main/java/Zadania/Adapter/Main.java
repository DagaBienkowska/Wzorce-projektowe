package Zadania.Adapter;

public class Main {

    public static void main(String[] args) {
        CardAdapter debitCardAdapter = new DebitCardAdapter();
        CardAdapter paybackCardAdapter = new PaybackCardAdapter();

        System.out.println(debitCardAdapter.take(200));
        System.out.println(paybackCardAdapter.take(300));
        System.out.println(debitCardAdapter.take(300000));
        System.out.println(paybackCardAdapter.take(300000));
    }
}
