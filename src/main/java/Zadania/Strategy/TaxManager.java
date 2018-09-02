package Zadania.Strategy;

import java.util.HashMap;
import java.util.Map;

public class TaxManager {

    enum CODES{
        PL, US;
    }

  private static Map<CODES, TaxStrategy> taxStrategyMap = new HashMap<>();
    static {
        taxStrategyMap.put(CODES.PL, new PLTax());
        taxStrategyMap.put(CODES.US, new USATax());
    }


    public static TaxStrategy getStrategy(CODES code){
        return taxStrategyMap.get(code);
    }

    public float calculateTax(CODES code, float income){
        return taxStrategyMap.get(code).calculate(income);
    }
}
