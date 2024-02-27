package Demo7_1;

public class Discount {
    private static final double SERVICE_DISCOUNT_PREMIUM = 0.2;
    private static final double SERVICE_DISCOUNT_GOLD = 0.15;
    private static final double SERVICE_DISCOUNT_SILVER = 0.1;
    private static final double PRODUCT_DISCOUNT_ALL_MEMBERS = 0.1;

    public static double getServiceDiscountRate(String memberType) {
        switch (memberType) {
            case "Premium":
                return SERVICE_DISCOUNT_PREMIUM;
            case "Gold":
                return SERVICE_DISCOUNT_GOLD;
            case "Silver":
                return SERVICE_DISCOUNT_SILVER;
            default:
                return 0.0; // No discount for non-members
        }
    }

    public static double getProductDiscountRate() {
        return PRODUCT_DISCOUNT_ALL_MEMBERS;
    }
}