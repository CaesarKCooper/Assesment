package ShopApp2;

import java.lang.reflect.Array;

public class Customer extends Person {

    private Clothing[] clothingItems;
    private char size;

    public Customer(){

    }

    public Customer(char size){
        this.size = size;
    }

    public char getSize() {

        return size;
    }






    @Override
    public String toString() {
        return "Customer{}";
    }
}
