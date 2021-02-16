package pattern.behavior.command;

public class DivideCommand implements Command {

    private Integer a;
    private Integer b;

    public DivideCommand(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int execOperation() {
        return a / b;
    }
}
