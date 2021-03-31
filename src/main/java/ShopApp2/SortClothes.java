package ShopApp2;

import java.util.Comparator;

public class SortClothes implements Comparator<Clothing> {
    @Override
    public int compare(Clothing a, Clothing b) {

        if(a.getPrice() > b.getPrice()){
        return 1;
    }
        return -1;
    }

}
