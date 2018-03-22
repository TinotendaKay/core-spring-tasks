package com.appress.shop.config;

import com.appress.shop.Cashier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by tinotenda on 2018/03/22.
 */
@Configuration
@Profile("global")
@ComponentScan("com.appress.shop")
public class ShopConfigurationGlobal {

    @Bean(initMethod = "openFile", destroyMethod = "closeFile")
    public Cashier cashier() {
        final String path = System.getProperty("java.io.tmpdir") + "/cashier";
        Cashier cashier = new Cashier();
        cashier.setFileName("checkout");
        cashier.setPath(path);
        return cashier;
    }
}
