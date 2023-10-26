package com.example.flowerstore.item;

import com.example.flowerstore.flowers.FlowerColor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Setter
@AllArgsConstructor
public class Flower extends Item{
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.color = flower.color;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.flowerType = flower.flowerType;
    }

    public Flower() {
    }

    public Flower(int price, int sepalLength, com.example.flowerstore.flowers.FlowerColor flowerColor) {
        this.price = price;
        this.sepalLength = sepalLength;
        this.color = flowerColor;

    }

    @Override
    public String toString() {
        return "Flower{" +
                "sepalLength=" + sepalLength +
                ", color=" + color +
                ", price=" + price +
                '}';
    }

    public String getColor() {
        return color.toString();
    }
}


