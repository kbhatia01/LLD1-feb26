package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Items> {
    private HashMap<String, T> data;

    Inventory(){
        data = new HashMap<>();
    }

    // create add method with qty >0 allowed..


    public T get(String id){
        return data.get(id);
    }

    public void add(T item) throws RuntimeException {
        if(item.getQty() < 0){
            throw new RuntimeException("Quantity is less than equal to zero which is invalid");
        }
        if(data.containsKey(item.getId())) {
//            System.out.println("Item " + item.getId() + " already exists");
            throw new RuntimeException("Item " + item.getId() + " already exists");
        }
        data.put(item.getId(), item);
    }

    public void remove(T item) {
        data.remove(item.getId());
    }

    public List<T> getAll() {
        return new ArrayList<>(data.values());
    }
}
