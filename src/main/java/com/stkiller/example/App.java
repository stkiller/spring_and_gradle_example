package com.stkiller.example;

import com.stkiller.example.engine.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: stkiller Date: 6/23/13 Time: 5:43 PM
 */
public class App {

    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

        final HelloWorld greetingBean = context.getBean("greetingBean", HelloWorld.class);
        greetingBean.printHello("StKiller");
    }
}
