package InventoryManagementSystem;

import java.util.*;

public class main {
    public static void main(){

        List<Items> a = new ArrayList<>();
        Items a1 = new Items("1", "a", 10, 1);
        Items a2 = new Items("2", "a1", 8, 1);
        Items a3 = new Items("3", "a2", 13, 1);
        Items a4 = new Items("4", "a3", 6, 1);

        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);
        Collections.sort(a);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getPrice());

        }
    }
}
