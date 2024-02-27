package Demo7_1;

public class Main {
    public static void main(String[] args) {
        Customer premiumCustomer = new Customer("Alice", "Premium");
        Customer goldCustomer = new Customer("Bob", "Gold");
        Customer silverCustomer = new Customer("Charlie", "Silver");
        Customer regularCustomer = new Customer("David", "None");

        Visit premiumVisit = new Visit(premiumCustomer);
        premiumVisit.setProductAmount(100);
        premiumVisit.setServiceAmount(200);

        Visit goldVisit = new Visit(goldCustomer);
        goldVisit.setProductAmount(50);
        goldVisit.setServiceAmount(150);

        Visit silverVisit = new Visit(silverCustomer);
        silverVisit.setProductAmount(25);
        silverVisit.setServiceAmount(75);

        Visit regularVisit = new Visit(regularCustomer);
        regularVisit.setProductAmount(10);
        regularVisit.setServiceAmount(30);

        printInvoice(premiumVisit);
        printInvoice(goldVisit);
        printInvoice(silverVisit);
        printInvoice(regularVisit);
    }

    private static void printInvoice(Visit visit) {
        System.out.println("**Invoice for customer " + visit.getCustomer().getName() + "**");
        System.out.println("Product: $" + visit.getProductAmount());
        System.out.println("Service: $" + visit.getServiceAmount());
        System.out.println("Product Discount: $" + visit.getProductAmount() * Discount.getProductDiscountRate());
        System.out.println("Service Discount: $" + visit.getServiceAmount() * Discount.getServiceDiscountRate(visit.getCustomer().getMemberType()));
        System.out.println("Total: $" + visit.calculateTotalBill());
        System.out.println();
    }
}