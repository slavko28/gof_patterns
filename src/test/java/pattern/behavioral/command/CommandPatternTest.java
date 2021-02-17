package pattern.behavioral.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandPatternTest {

    @Test
    public void commandTest(){
        Calculator calculator = new Calculator();
        assertEquals(14, calculator.calculate(new AddCommand(4, 10)));
        assertEquals(18, calculator.calculate(new MinusCommand(20, 2)));
        assertEquals(50, calculator.calculate(new MultipleCommand(10, 5)));
        assertEquals(3, calculator.calculate(new DivideCommand(15, 5)));
    }
}
