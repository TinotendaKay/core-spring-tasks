package com.appress.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Date;
import java.util.Locale;

/**
 * Created by tinotenda on 2018/03/22.
 */
@Component
public class Cashier {
    private String fileName;
    private String path;
    private BufferedWriter writer;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Autowired
    private MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void checkout(ShoppingCart cart) throws IOException {
        String message = messageSource.getMessage("alert.inventory.checkout", new Object[]{cart.getProductList(), new Date()}, new Locale("en", "ZA"));
        writer.write(new Date() + "\t" + cart.getProductList()+"\r\n");
        writer.flush();
        System.out.println(message);
    }

    public void openFile() throws IOException {
        File targetDir = new File(path);
        if(!targetDir.exists()) {
            targetDir.mkdir();
        }

        File checkoutFile = new File(path, fileName + ".txt");
        if(!checkoutFile.exists()) {
            checkoutFile.createNewFile();
        }

        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(checkoutFile, true)));

    }

    public void closeFile() throws Exception {
        writer.close();
    }
}
