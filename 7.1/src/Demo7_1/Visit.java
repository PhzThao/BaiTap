package Demo7_1;

public class Visit {
    private Customer customer;
    private double productAmount;
    private double serviceAmount;

    public Visit(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setProductAmount(double productAmount) {
        this.productAmount = productAmount;
    }

    public double getProductAmount() {
        return productAmount;
    }

    public void setServiceAmount(double serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public double getServiceAmount() {
        return serviceAmount;
    }

    public double calculateTotalBill() {
        double productDiscountAmount = productAmount * Discount.getProductDiscountRate();
        double serviceDiscountAmount = serviceAmount * Discount.getServiceDiscountRate(customer.getMemberType());
        double totalBillBeforeTax = productAmount - productDiscountAmount + serviceAmount - serviceDiscountAmount;
        return totalBillBeforeTax;
    }
}
