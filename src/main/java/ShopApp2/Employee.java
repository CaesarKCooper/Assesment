package ShopApp2;

public class Employee extends Customer {


    private final double DISCOUNT = .10;


    public Employee(Clothing[] cart){


    }

    public Employee() {

    }


    public double getDiscount(Clothing clothing){

        double totalDiscount = DISCOUNT * clothing.getPrice();

        double finalPrice = clothing.getPrice() - totalDiscount;


        return finalPrice;
}




}