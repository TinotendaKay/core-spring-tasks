package com.appress.shop;

/**
 * Created by tinotenda on 2018/03/22.
 */
public abstract class Product {

    private String name;
    private double price;
    private double discount;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Product{");
        builder.append("name=").append(name);
        builder.append(", price=").append(price);
        builder.append(", discount=").append(discount);
        builder.append("}");
        return  builder.toString();
    }
}
