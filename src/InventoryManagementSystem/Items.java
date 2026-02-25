package InventoryManagementSystem;

public class Items implements Comparable<Items> {
    private String id;
    private String name;
    private int price;
    private int qty;

    Items(String id, String name, int price, int qty){
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(Items o) {
        if(this.price< o.price){
            return -1;
        } else if (this.price> o.price) {
            return 1;
        }
        return 0;
    }
}
