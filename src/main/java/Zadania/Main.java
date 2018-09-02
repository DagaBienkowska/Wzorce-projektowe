package Zadania;

public class Main {

    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();

        System.out.println(factoryProducer.getFactory("Torino").orderPizza("Hawana").getIngredients());
    }

}
