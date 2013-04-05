package com.hendyirawan.blastpublickey;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("META-INF/shell-context.xml");
    	appCtx.start();
    }
}
