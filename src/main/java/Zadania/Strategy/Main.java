package Zadania.Strategy;

import static Zadania.Strategy.TaxManager.CODES.*;

public class Main {
    public static void main(String[] args) {

        TaxManager taxManager = new TaxManager();

        System.out.println(taxManager.calculateTax(PL, 20000));
        System.out.println(taxManager.calculateTax(US, 30000));

    }
}
