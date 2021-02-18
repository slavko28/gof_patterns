package pattern.strutural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BridgeTest {

    @Test
    void bridgeTest() {
        Shape blueSquare = new Square(new Blue());
        assertEquals("Square drawn. Color is blue", blueSquare.draw());
        Shape redSquare = new Square(new Red());
        assertEquals("Square drawn. Color is red", redSquare.draw());

    }
}