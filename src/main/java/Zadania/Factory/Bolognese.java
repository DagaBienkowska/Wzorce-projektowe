package Zadania.Factory;

public class Bolognese implements Pasta {

    private String pastaName = "Bolognese";

    @Override
    public String getPastatype() {
        return pastaName;
    }
}
