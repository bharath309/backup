package com.bharath.belljava_spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App 
{
    public static void main( String[] args )   {
   // LaptopDetails ld=new LaptopDetails();
    ApplicationContext tx=new ClassPathXmlApplicationContext("spring-xml-config.xml");
    LaptopDetails dell=tx.getBean("dell",LaptopDetails.class);
    //LaptopDetails mac=tx.getBean("mac",LaptopDetails.class);

    System.out.println(dell);	
    }
}
