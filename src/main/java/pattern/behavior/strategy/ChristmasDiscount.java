package pattern.behavior.strategy;

public class ChristmasDiscount implements Discounter {
    @Override
    public Double getDiscount() {
        return 0.25;
    }
}
