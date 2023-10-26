package com.example.flowerstore.order;

import com.example.flowerstore.delivery.Delivery;
import com.example.flowerstore.item.Item;
import com.example.flowerstore.payment.Payment;
import lombok.Getter;

import java.util.LinkedList;
@Getter
public class Order {
    private LinkedList<Item> items = new LinkedList<>();
    private String payment;
    private String delivery;

    public void setPaymentStrategy(Payment payment){
        this.payment = payment.pay(calculateTotalPrice());

    }
    public String processOrder(){
        return "Order is on the way...";
    }

    public void  setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery.delivery();
    }

    public double calculateTotalPrice(){
        double total = 0;
        for(Item flower:items){
            total += flower.getPrice();
        }
        return total;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void deleteItem(Item item){
        items.remove(item);
    }

}
