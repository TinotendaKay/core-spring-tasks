package com.apress.shop;

/**
 *
 * @author tinotenda
 */
public abstract class Product {
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Product{");
        builder.append("name=").append(name);
        builder.append(", price=").append(price);
        builder.append("}");
        return  builder.toString();
    }
    
}
