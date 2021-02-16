package pattern.behavior.state;

import org.junit.jupiter.api.Test;
import pattern.bevavior.state.DeliveredState;
import pattern.bevavior.state.MyPackage;
import pattern.bevavior.state.OrderedState;
import pattern.bevavior.state.ReceivedState;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StatePatternTest {

    @Test
    public void testStatePattern() {
        MyPackage myPackage = new MyPackage();
        assertTrue(myPackage.getState() instanceof OrderedState);
        myPackage.prevState();
        assertTrue(myPackage.getState() instanceof OrderedState);
        assertEquals("Package ordered.", myPackage.getStatus());
        myPackage.nextState();
        assertTrue(myPackage.getState() instanceof DeliveredState);
        assertEquals("Package delivered.", myPackage.getStatus());
        myPackage.prevState();
        assertTrue(myPackage.getState() instanceof OrderedState);
        myPackage.nextState();
        myPackage.nextState();
        assertTrue(myPackage.getState() instanceof ReceivedState);
        assertEquals("Package received.", myPackage.getStatus());
    }

}
