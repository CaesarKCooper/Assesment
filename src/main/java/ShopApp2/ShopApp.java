package ShopApp2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShopApp {

    public ShopApp(Clothing[] managerCart) {
    }


    public static double calcTotal(Clothing[] clothing) {

        int total = 0;

        for (int i = 0; i < clothing.length; i++) {

            total += clothing[i].getPrice() ;


        }
        return total;

    }

    public static boolean isAFit(Customer customer, Clothing clothing){
        int check = Character.compare(customer.getSize(), clothing.getSize());
        if(check == 0){
            return true;
        }
        return false;
    }

    public void printEmployeeName(Employee employee){
        System.out.println(employee.getName());
    }


    public void sortAndPrintClothingItemsByPrice(ArrayList<Clothing> clothing){



    }

}








