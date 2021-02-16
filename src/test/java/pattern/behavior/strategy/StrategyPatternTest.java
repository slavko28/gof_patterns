package pattern.behavior.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyPatternTest {

    @Test
    public void discountTest() {
        Supermarket supermarket = new Supermarket();
        //       Price with Christmas discount 25 %
        assertEquals(25.0, supermarket.getDiscount(1, 100.0));
        //       Prise with Easter discount 50 %
        assertEquals(50.0, supermarket.getDiscount(4, 100.0));
        //       Price without discount 0 %
        assertEquals(100.0, supermarket.getDiscount(2, 100.0));
        assertEquals(100.0, supermarket.getDiscount(10, 100.0));
    }
}
