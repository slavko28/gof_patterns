package pattern.behavior.strategy;

public class NoDiscount implements Discounter {
    @Override
    public Double getDiscount() {
        return 1.0;
    }
}
