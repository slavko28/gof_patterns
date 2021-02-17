package pattern.behavioral.command;

public class Calculator {

    public int calculate(Command command){
        return command.execOperation();
    }
}
