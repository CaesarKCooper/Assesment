package ShopApp2;

public class Manager extends Employee implements Discountable {

    private final double DISCOUNT = .25;

    public double getDiscount(Clothing clothing){

        double totalDiscount = DISCOUNT * clothing.getPrice();

        double finalPrice = clothing.getPrice() - totalDiscount;


        return finalPrice;

    }

    public Manager(Clothing[] cart){

    }



    @Override
    public String toString() {
        return "Manager{}";
    }

    @Override
    public void calcDiscount(double clothing) {

    }
}
