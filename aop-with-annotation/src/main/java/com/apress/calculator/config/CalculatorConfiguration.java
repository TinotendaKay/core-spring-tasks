package com.apress.calculator.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by tinotenda on 2018/03/23.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.apress.calculator")
public class CalculatorConfiguration {
}
