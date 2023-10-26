package com.example.flowerstore.flowers;

import com.example.flowerstore.delivery.PostDeliveryStrategy;
import com.example.flowerstore.item.Flower;
import com.example.flowerstore.item.FlowerType;
import com.example.flowerstore.item.Item;
import com.example.flowerstore.order.Order;
import com.example.flowerstore.payment.PayPalPaymentStrategy;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/flower")
public class FlowerController {

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @GetMapping("/list")
//    public List<Flower> getFlower() {
//        return flowerService.getFlowers();
//    }
//    @GetMapping("/order")
public String getOrder() {
        Order a = new Order();
        a.addItem(new Flower(12, 35, FlowerColor.RED));
        a.addItem(new Flower(15, 10, FlowerColor.BLUE));
        double total = a.calculateTotalPrice();
        a.setDeliveryStrategy(new PostDeliveryStrategy());
        a.setPaymentStrategy(new PayPalPaymentStrategy());
        System.out.println(total);
        StringBuilder res = new StringBuilder();
        for(Item item:a.getItems()){
            res.append(item);
        }
        res.append("{\n Total price: " + total + "}");
        res.append("\n {Delivery: " + a.getDelivery() + "}");
        res.append(a.getPayment());
        return res.toString();
    }
}
