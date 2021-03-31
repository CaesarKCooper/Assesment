package ShopApp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {


        Clothing clothing1 = new Clothing("Shirt", 100.00, 'L');
        Clothing clothing2 = new Clothing("Pants", 50.00, 'M');
        Clothing clothing3 = new Clothing("Socks", 500.00, 'S');

        Customer customer1 = new Customer('L');

        Clothing[] managerCart = {clothing1, clothing2, clothing3};

        Clothing[] employeeCart = {clothing1, clothing2, clothing3};

        Clothing[] discountables = {clothing1, clothing2};

        Employee employee1 = new Employee(employeeCart);
        employee1.setName("Bianca");
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee();
        hourlyEmployee1.setName("Joelina");
        Manager manager1 = new Manager(managerCart);
        manager1.setName("Dnayah");

        ShopApp shopApp = new ShopApp(managerCart);

        //Prints total of managers cart
        System.out.println(ShopApp.calcTotal(managerCart));

        //Prints out if customer can fit clothing
        System.out.println(shopApp.isAFit(customer1,clothing1));

        //Prints out price of clothing after discount (hourly employee)

        System.out.println(hourlyEmployee1.getDiscount(clothing1));

        //Prints out price of clothing after discount (Manager)
        System.out.println(manager1.getDiscount(clothing1));

      //Makes array list and prints out with for each loop
        ArrayList<Clothing> clothingArrayList = new ArrayList<>();
        clothingArrayList.add(clothing1);
        clothingArrayList.add(clothing2);
        clothingArrayList.add(clothing3);

        for(Clothing c : clothingArrayList){
            System.out.println(c);
        }

      //Prints out employees names one by one
        System.out.println(employee1.getName());
        System.out.println(hourlyEmployee1.getName());
        System.out.println(manager1.getName());

      //Prints sorted array
        SortClothes s = new SortClothes();

        Collections.sort(clothingArrayList, s);

        for(Clothing c : clothingArrayList){
            System.out.println(c);

        }








    }




}
