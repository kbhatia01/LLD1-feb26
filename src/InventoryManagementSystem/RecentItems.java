package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentItems {

    private LinkedList<Items> items;
    private Integer MAX_VALUES = 10;
    RecentItems(){
        items= new LinkedList<>();
    }

    void RecentSeen(Items i){
        items.remove(i);
        items.addFirst(i);
        if(items.size() > MAX_VALUES){
            items.removeLast();
        }

    }


    public List<Items> getRecent(){
        return new ArrayList<>(items);
    }
}
