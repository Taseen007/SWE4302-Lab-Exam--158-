import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class InvoiceGenerator {
    private static final double TAX_RATE = 0.08;

    public static void generateInvoice(Order order, String fileName) throws IOException {
        double subtotal = 0.0;
        StringBuilder invoice = new StringBuilder("Ice Cream Shop Invoice\n");


        for (Map.Entry<String, Integer> entry : order.getIceCreamScoops().entrySet()) {
            String flavor = entry.getKey();
            int count = entry.getValue();
            double price = Menu.getFlavors().get(flavor) * count;
            subtotal += price;
            invoice.append(String.format("%s - %d scoop(s): $%.2f\n", flavor, count, price));
        }


        for (Map.Entry<String, Integer> entry : order.getToppingCounts().entrySet()) {
            String topping = entry.getKey();
            int count = entry.getValue();
            double price = Menu.getToppings().get(topping) * count;
            subtotal += price;
            invoice.append(String.format("%s - %d time(s): $%.2f\n", topping, count, price));
        }


        if (order.isWaffleCone()) {
            subtotal += 5.00;
            invoice.append("Waffle Cone: $5.00\n");
        }


        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        invoice.append(String.format("Subtotal: $%.2f\n", subtotal));
        invoice.append(String.format("Tax: $%.2f\n", tax));
        invoice.append(String.format("Total Amount Due: $%.2f\n", total));


        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(invoice.toString());
        }
    }
}
