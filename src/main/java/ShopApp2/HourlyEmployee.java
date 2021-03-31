package ShopApp2;

public class HourlyEmployee extends Employee {

    private final double DISCOUNT = .10;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(Clothing[] cart) {
        super(cart);
    }




    public double getDiscount(Clothing clothing) {


        double totalDiscount = DISCOUNT * clothing.getPrice();

        double finalPrice = clothing.getPrice() - totalDiscount;


        return finalPrice;
    }

}
