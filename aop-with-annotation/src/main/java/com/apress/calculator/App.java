package com.apress.calculator;

import com.apress.calculator.config.CalculatorConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);

        ArithmeticCalculator arithmeticCalculator = context.getBean("arithmeticCalculator", ArithmeticCalculator.class);
        arithmeticCalculator.add(3, 3);
        arithmeticCalculator.sub(3, 2);
        arithmeticCalculator.mul(3, 3);
        arithmeticCalculator.div(9, 4);

        UnitCalculator unitCalculator = context.getBean("unitCalculator", UnitCalculator.class);
        unitCalculator.kilogramToPound(15);
        unitCalculator.kilometerToMile(10);

    }
}
