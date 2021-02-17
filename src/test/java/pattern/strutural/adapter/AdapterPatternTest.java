package pattern.strutural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdapterPatternTest {

    @Test
    void testAdapter() {
        Movable car = new DodgeChallenger();
        MovableAdapter movableAdapter = new MovableAdapterImpl(car);
        assertEquals(movableAdapter.getSpeed(), 326.696832, 0.000001);
    }
}