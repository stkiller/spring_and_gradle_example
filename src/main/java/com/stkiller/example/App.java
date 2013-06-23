package com.stkiller.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: stkiller Date: 6/23/13 Time: 5:43 PM
 */
public class App {
    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext(
                "Spring-Module.xml");

        final DefaultHelloWorld obj = (DefaultHelloWorld) context.getBean("helloBean");
        obj.printHello();
    }
}
