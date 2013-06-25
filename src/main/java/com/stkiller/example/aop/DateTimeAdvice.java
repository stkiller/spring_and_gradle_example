package com.stkiller.example.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author apodoprigora (25/06/2013)
 */
public class DateTimeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        Logger logger = LoggerFactory.getLogger(DateTimeAdvice.class);
        logger.info("Invocation time : " + new Date());
        logger.info("Invoked method : " + method);
    }
}
