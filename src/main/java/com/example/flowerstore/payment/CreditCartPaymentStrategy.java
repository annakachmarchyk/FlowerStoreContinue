package com.example.flowerstore.payment;

public class CreditCartPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "\n{Paying with card, " + price + "}";
    }
}
