package InventoryManagementSystem;

public class Order implements Comparable<Order> {
    private String orderId;
    private boolean isExpress;

    public Order(String orderId, boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }


    @Override
    public int compareTo(Order o) {
        if(this.isExpress && o.isExpress){
            this.orderId.compareTo(o.orderId);
        } else if (this.isExpress){
            return 1;
        }
        return -1;

    }
}

// TODO: WISHLIST<ITEMS> : SET.. Impelment it on your own..
// STITCH ITEM TOGETHER..

