package pattern.behavioral.command;

public class AddCommand implements Command {

    private Integer a;
    private Integer b;

    public AddCommand(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int execOperation() {
        return a + b;
    }
}
