package com.appress.shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tinotenda on 2018/03/22.
 */
public class ShoppingCart {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }
}
