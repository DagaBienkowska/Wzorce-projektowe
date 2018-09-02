package Zadania.Factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hawana implements Pizza {

    List<String> hawana = new ArrayList<>(Arrays.asList("tomato sauce", "cheese", "pinaple", "peach", "oregano"));

    @Override
    public List<String> getIngredients() {
        return new ArrayList<>(hawana);
    }
}
