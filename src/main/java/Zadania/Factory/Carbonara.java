package Zadania.Factory;

public class Carbonara implements Pasta {

    private String pastaName = "Carbonara";

    @Override
    public String getPastatype() {
        return pastaName;
    }
}
