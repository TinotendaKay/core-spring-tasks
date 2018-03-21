package com.apress.shop.config;

import com.apress.shop.BannerLoader;
import com.apress.shop.Battery;
import com.apress.shop.Disc;
import com.apress.shop.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.Resource;

/**
 * @author tinotenda
 */
@Configuration
@PropertySource("classpath:discounts.properties")
@ComponentScan("com.apress.shop")
public class ShopConfiguration {

    @Value("${endofyear.discount:0}")
    private double specialEndofYearDiscountField;

    @Value("classpath:banner.txt")
    private Resource resource;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public BannerLoader bannerLoader() {
        BannerLoader bannerLoader = new BannerLoader();
        bannerLoader.setBanner(resource);
        return bannerLoader;
    }

    @Bean
    public Product aaa() {
        Battery battery = new Battery("AAA", 2.5);
        battery.setRechargeable(true);
        return battery;
    }

    @Bean
    Product cdrw() {
        Disc disc = new Disc("CD-RW", 1.5);
        disc.setCapacity(700);
        return disc;
    }

    @Bean
    Product dvdrw() {
        Disc disc = new Disc("DVD-RW", 4.0, specialEndofYearDiscountField);
        disc.setCapacity(1200);
        return disc;
    }

    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        messageSource.setCacheSeconds(1);
        return messageSource;
    }

}
