package Zadania.Factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Salami implements Pizza {

    private List<String> salami = new ArrayList<>(Arrays.asList("tomato sauce", "cheese", "salami", "oregano"));

    @Override
    public List<String> getIngredients() {
        return new ArrayList<>(salami);
    }
}
