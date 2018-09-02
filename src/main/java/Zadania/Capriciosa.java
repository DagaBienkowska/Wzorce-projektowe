package Zadania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capriciosa implements Pizza {

    private List<String> capriciosa = new ArrayList<>(Arrays.asList("tomato sauce", "cheese", "mashrooms", "oregano"));

    @Override
    public List<String> getIngredients() {
        return new ArrayList<>(capriciosa);
    }
}
