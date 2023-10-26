package com.example.flowerstore.payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "\n{Paying with PayPal, " + price + "}";
    }
}
