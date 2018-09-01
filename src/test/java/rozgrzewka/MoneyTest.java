package rozgrzewka;

import static org.junit.jupiter.api.Assertions.*;
import static rozgrzewka.Money.CURRENCY.EUR;

import org.junit.jupiter.api.*;

class MoneyTest {

    Money euro;

    @BeforeEach
    public void beforeEach(){
        euro = new Money(EUR, 10);
    }

    @Test
    public void testGetCurrency(){
        assertEquals(EUR, euro.getCurrency());
    }

    @Test
    public void testGetAmount(){
        assertEquals(10, euro.getAmount());
    }

}