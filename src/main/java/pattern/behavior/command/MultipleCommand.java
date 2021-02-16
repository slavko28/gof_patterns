package pattern.behavior.command;

public class MultipleCommand implements Command {

    private Integer a;
    private Integer b;

    public MultipleCommand(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int execOperation() {
        return a * b;
    }
}
