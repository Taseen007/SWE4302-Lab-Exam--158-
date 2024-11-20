import java.util.HashMap;
import java.util.Map;

public class Order {
    private final Map<String, Integer> iceCreamScoops = new HashMap<>();
    private final Map<String, Integer> toppingCounts = new HashMap<>();
    private boolean isWaffleCone = false;

    public void addScoop(String flavor, int count) {
        iceCreamScoops.put(flavor, iceCreamScoops.getOrDefault(flavor, 0) + count);
    }

    public void addTopping(String topping, int count) {
        toppingCounts.put(topping, toppingCounts.getOrDefault(topping, 0) + count);
    }

    public void chooseWaffleCone(boolean waffleCone) {
        this.isWaffleCone = waffleCone;
    }

    public boolean isWaffleCone() {
        return isWaffleCone;
    }

    public Map<String, Integer> getIceCreamScoops() {
        return iceCreamScoops;
    }

    public Map<String, Integer> getToppingCounts() {
        return toppingCounts;
    }
}
