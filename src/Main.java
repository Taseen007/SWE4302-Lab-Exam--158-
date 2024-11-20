import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();


        order.addScoop("Chocolate Fudge", 2);
        order.addScoop("Mint Chocolate Chip", 1);
        order.addTopping("Chocolate Chips", 1);
        order.addTopping("Fresh Strawberries", 2);


        order.chooseWaffleCone(true);


        try {
            InvoiceGenerator.generateInvoice(order, "Invoice.txt");
            System.out.println("Invoice generated successfully. Check Invoice.txt!");
        } catch (IOException e) {
            System.err.println("Error generating invoice: " + e.getMessage());
        }
    }
}
