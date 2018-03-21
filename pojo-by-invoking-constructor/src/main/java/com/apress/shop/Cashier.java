package com.apress.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Locale;

@Component
public class Cashier {

    @Autowired
    private MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void checkout(ShoppingCart cart) {
        String message = messageSource.getMessage("alert.inventory.checkout", new Object[]{cart.getProductList(), new Date()}, new Locale("en", "ZA"));
        System.out.println(message);
    }

}
