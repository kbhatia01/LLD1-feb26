package InventoryManagementSystem;

import java.util.Comparator;

public class NameComparator implements Comparator<Items> {

    @Override
    public int compare(Items o1, Items o2) {
       if( o1.getQty() > o2.getQty()){
            return 1;
        }
       return 0;
    }
}
