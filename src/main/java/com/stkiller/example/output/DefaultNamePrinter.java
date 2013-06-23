package com.stkiller.example.output;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: stkiller Date: 6/23/13 Time: 5:50 PM
 */
public class DefaultNamePrinter implements NamePrinter {

    public static final Logger LOGGER = LoggerFactory.getLogger(DefaultNamePrinter.class);


    @Override
    public void printName(final String aName) {
        LOGGER.info(String.format("Hello , %s !", aName));
    }

}
