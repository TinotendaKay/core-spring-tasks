package com.apress.shop;

/**
 *
 * @author tinotenda
 */
public class Disc extends Product {
    private int capacity;

    public Disc() {
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
