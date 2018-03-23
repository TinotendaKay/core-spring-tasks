package com.apress.calculator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by tinotenda on 2018/03/23.
 */
@Aspect
@Component
public class CalculatorLoggingAspect {

    private static Logger LOGGER = LoggerFactory.getLogger(CalculatorLoggingAspect.class);

    @Before("execution(* ArithmeticCalculator.add(..))")
    public void logBefore() {
        LOGGER.info("The method add() begins");
    }

    @After("execution(* ArithmeticCalculator.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        LOGGER.info("The method {}() ends", joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* UnitCalculator.*(..))", returning = "result")
    public void LogAfterReturning(JoinPoint joinPoint, Object result) {
        LOGGER.info("The method {}() ends with result {}", joinPoint.getSignature().getName(), result);
    }

    @AfterThrowing(pointcut = "execution(* *.*(..))", throwing = "e")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
        LOGGER.error("An exception {} has been thrown in {}()", e, joinPoint.getSignature().getName());
    }


}
