package com.apress.shop;

import com.apress.shop.config.ShopConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    
   public static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    
    public static void main( String[] args )  {
        ApplicationContext context = new AnnotationConfigApplicationContext(ShopConfiguration.class);
        
        Product aaa = context.getBean("aaa", Product.class);
        Product cdrw = context.getBean("cdrw", Product.class);
        Product dvdrw = context.getBean("dvdrw", Product.class);

        ShoppingCart shoppingCart1 = context.getBean("shoppingCart", ShoppingCart.class);
        shoppingCart1.addProduct(aaa);
        shoppingCart1.addProduct(cdrw);

        LOGGER.info("Shopping Cart 1: {}", shoppingCart1.getProductList());

        ShoppingCart shoppingCart2 = context.getBean("shoppingCart", ShoppingCart.class);

        shoppingCart2.addProduct(dvdrw);
        LOGGER.info("Shopping Cart 2: {}", shoppingCart2.getProductList());

        LOGGER.info("AAA", aaa);
        LOGGER.info("CD-RW", cdrw);
        LOGGER.info("DVD-RW", dvdrw);
    }
}
