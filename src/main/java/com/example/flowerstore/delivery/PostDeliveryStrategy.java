package com.example.flowerstore.delivery;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public String delivery() {
        return("Post delivery");
    }
}
