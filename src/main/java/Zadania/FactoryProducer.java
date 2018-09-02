package Zadania;

public class FactoryProducer {

    public AbstractFactory getFactory(String name){
        if (name == "Torino"){
            return new TorinoFactory();
        }
        return new SicilianFactory();
    }
}
