package com.apress.shop.config;

import com.apress.shop.Battery;
import com.apress.shop.Disc;
import com.apress.shop.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author tinotenda
 */
@Configuration
public class ShopConfiguration {
    
    @Bean
    public Product aaa() {
        Battery battery = new Battery("AAA", 2.5);
        battery.setRechargeable(true);
        return battery;
    }
    
    @Bean Product cdrw() {
        Disc disc = new Disc("CD-RW", 1.5);
        disc.setCapacity(700);
        return disc;
    }
    
}
