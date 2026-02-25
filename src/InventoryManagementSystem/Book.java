package InventoryManagementSystem;

public class Book extends Items {
    private String author;

    public Book(String id , String name, int price , int quantity, String author) {
        super(id, name, price, quantity);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}