package com.stkiller.example;

import com.stkiller.example.output.NamePrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: stkiller Date: 6/23/13 Time: 5:40 PM
 */
public class DefaultHelloWorld implements HelloWorld {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultHelloWorld.class);
    private NamePrinter namePrinter;


    @Override
    public void printHello(final String aName) {
        namePrinter.printName(aName);
    }


    public void setNamePrinter(NamePrinter namePrinter) {
        this.namePrinter = namePrinter;
    }


    public void init() {
        LOGGER.info("Initialization method invoked : " + namePrinter);
    }
}
