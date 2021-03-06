package com.appress.shop;

/**
 * Created by tinotenda on 2018/03/22.
 */
public class Battery extends Product {
    private boolean rechargeable;

    public Battery() {
        super();
    }

    public Battery(String name, double price) {
        super(name, price);
    }

    public boolean isRechargeable() {
        return rechargeable;
    }

    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Battery{");
        builder.append("rechargeable=").append(rechargeable);
        builder.append("}");
        return super.toString().concat(builder.toString());
    }
}
