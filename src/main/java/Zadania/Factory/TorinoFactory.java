package Zadania.Factory;

public class TorinoFactory extends AbstractFactory {
    @Override
    Pizza orderPizza(String name) {

        if (name == "Hawana"){
            return new Hawana();
        }
        if (name == "Capriciosa"){
            return new Capriciosa();
        }
        return null;
    }

    @Override
    Pasta orderPasta(String name) {

        if (name == "Bolognese"){
            return new Bolognese();
        }
        return null;
    }
}
