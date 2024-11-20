

import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {


    @Test
        public void testAddMultipleFlavors() {
            Order order = new Order();
            order.addScoop("Chocolate Fudge", 2);
            order.addScoop("Mint Chocolate Chip", 3);

            Map<String, Integer> scoops = order.getIceCreamScoops();

            assertEquals(Optional.of(2), scoops.get("Chocolate Fudge"));
            assertEquals(Optional.of(3), scoops.get("Mint Chocolate Chip"));
        }

    @Test
    public void testAddMultipleToppings() {
        Order order = new Order();
        order.addTopping("Sprinkles", 1);
        order.addTopping("Chocolate Chips", 1);

        Map<String, Integer> toppings = order.getToppingCounts();

        assertEquals(Optional.of(2), toppings.get("Sprinkles"));
        assertEquals(1, Optional.ofNullable(toppings.get("Chocolate Chips")));
    }


    @Test
    public void testWaffleConeSelection() {
        Order order = new Order();
        order.chooseWaffleCone(true);

        assertTrue(order.isWaffleCone());

        order.chooseWaffleCone(false);

        assertFalse(order.isWaffleCone());
    }


    }








}
