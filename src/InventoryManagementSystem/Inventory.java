package InventoryManagementSystem;

import java.util.HashMap;

public class Inventory<T extends Items> {
    private HashMap<String, T> data;

    Inventory(){
        data = new HashMap<>();
    }

    // create add method with qty >0 allowed..


    public T get(String id){
        return data.get(id);
    }
}
