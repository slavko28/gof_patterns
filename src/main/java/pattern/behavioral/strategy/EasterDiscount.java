package pattern.behavioral.strategy;

public class EasterDiscount implements Discounter {
    @Override
    public Double getDiscount() {
        return 0.5;
    }
}
