import java.util.HashMap;
import java.util.Map;

public class Menu {
    private static final Map<String, Double> flavors = new HashMap<>();
    private static final Map<String, Double> toppings = new HashMap<>();

    static {

        flavors.put("Mint Chocolate Chip", 2.80);
        flavors.put("Chocolate Fudge", 3.00);
        flavors.put("Strawberry Swirl", 2.75);
        flavors.put("Pistachio Delight", 3.25);

        toppings.put("Sprinkles", 0.30);
        toppings.put("Marshmallow", 0.70);
        toppings.put("Crushed Oreo", 0.85);
        toppings.put("Fresh Strawberries", 1.00);
        toppings.put("Chocolate Chips", 0.50);
    }

    public static Map<String, Double> getFlavors() {
        return flavors;
    }

    public static Map<String, Double> getToppings() {
        return toppings;
    }
}

