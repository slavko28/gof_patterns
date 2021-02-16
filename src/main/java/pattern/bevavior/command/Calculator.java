package pattern.bevavior.command;

public class Calculator {

    public int calculate(Command command){
        return command.execOperation();
    }
}
