package com.appress.shop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Hello world!
 *
 */
public class App {

    private static Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) {

        LOGGER.info("Initializing Application context");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        String[] activeProfiles = context.getEnvironment().getActiveProfiles();
        for (String profile :
                activeProfiles) {
            LOGGER.debug("Active Profile: {}", profile);
        }
        context.refresh();
    }
}
