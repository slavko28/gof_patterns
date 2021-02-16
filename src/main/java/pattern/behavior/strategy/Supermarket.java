package pattern.behavior.strategy;

import java.util.HashMap;
import java.util.Map;

public class Supermarket {

    private Map<Integer, Discounter> context = new HashMap<>();

    public Supermarket() {
        context.put(1, new ChristmasDiscount());
        context.put(4, new EasterDiscount());
    }

    public Double getDiscount(int month, Double price) {
        Discounter discounter = context.getOrDefault(month, new NoDiscount());
        return price * discounter.getDiscount();
    }
}
