package com.stkiller.example;

import com.stkiller.example.output.NamePrinter;

/**
 * User: stkiller Date: 6/23/13 Time: 5:40 PM
 */
public class DefaultHelloWorld {


    private String name;
    private NamePrinter namePrinter;


    public DefaultHelloWorld(String name, final NamePrinter aNamePrinter) {
        this.name = name;
        namePrinter = aNamePrinter;
    }


    public void printHello() {
        namePrinter.printName(name);
    }
}
