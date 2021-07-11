package com.javabrains.maven.series1;

import org.slf4j.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		//log using slf4j
		Logger logger = LoggerFactory.getLogger(App.class);
		logger.info("hello worlf from slf4j");
    }
}
