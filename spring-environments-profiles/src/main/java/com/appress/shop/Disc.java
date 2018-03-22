package com.appress.shop;

/**
 * Created by tinotenda on 2018/03/22.
 */
public class Disc extends Product{

    private int capacity;
    public Disc() {
    }

    public Disc(String name, double price, double discount) {
        super(name, price, discount);
    }

    public Disc(String name, double price) {
        super(name, price);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString().concat("Disc{" + "capacity=" + capacity + '}');
    }

}
