package com.example.flowerstore.delivery;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public String delivery() {
        return ("DHL delivery");
    }
}
