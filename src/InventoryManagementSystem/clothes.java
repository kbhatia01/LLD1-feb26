package InventoryManagementSystem;

public class clothes extends Items{
    private String size;

    public clothes(String id, String name, int price , int quantity ,  String size){
        super(id, name, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
