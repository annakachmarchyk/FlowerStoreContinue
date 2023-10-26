package com.example.flowerstore;

import com.example.flowerstore.payment.CreditCartPaymentStrategy;
import com.example.flowerstore.payment.PayPalPaymentStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTests {
    @Test
    public void testCardPay() {
        CreditCartPaymentStrategy creditCardPayment = new CreditCartPaymentStrategy();
        double price = 100.00; // Replace with the desired price
        String result = creditCardPayment.pay(price);
        String expected = "\n{Paying with card, " + price + "}";
        assertEquals(expected, result);
    }

    @Test
    public void testPaymentPay() {
    PayPalPaymentStrategy payPalPayment = new PayPalPaymentStrategy();
    double price = 0;
    String result = payPalPayment.pay(price);
    String expected = "\n{Paying with PayPal, " + price + "}";
    assertEquals(expected, result);
}
}
