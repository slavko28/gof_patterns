package pattern.behavior.command;

public class MinusCommand implements Command {

    private Integer a;
    private Integer b;

    public MinusCommand(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int execOperation() {
        return a - b;
    }
}
