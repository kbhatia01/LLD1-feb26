package InventoryManagementSystem;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessor {

    private Queue<Order> pq;

    OrderProcessor(){
        pq = new PriorityQueue<>();
    }

    public void addOrder(Order o){
        pq.offer(o);
    }

    public void process(){
        System.out.println(pq.poll());
    }

    public int pendingOrder(){
        return pq.size();
    }
}
