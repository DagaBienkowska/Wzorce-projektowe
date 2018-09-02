package Zadania.Factory;

public class SicilianFactory extends AbstractFactory {
    @Override
    Pizza orderPizza(String name) {
        if (name == "Salami") {
            return new Salami();
        }
        if (name == "Capriciosa") {
            return new Capriciosa();
        }
        return null;
    }

    @Override
    Pasta orderPasta(String name) {
        if (name == "Carbonara"){
            return new Carbonara();
        }
        return null;
    }
}
