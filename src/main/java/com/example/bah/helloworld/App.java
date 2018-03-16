package com.example.bah.helloworld;

/**
 * Hello world!
 *
 */

import java.util.logging.Logger;



public class App
{
    private static Logger logger = Logger.getLogger("App.class");

    public static void main( String[] args ) {
        for (int i = 0; i < 10; i++) {

            logger.info("How are you?");
            logger.info("Hello World!");
        }
    }
    public void main1(  )
    {

        logger.info("How are you?");
    }
}
