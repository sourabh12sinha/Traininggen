package com.org.spring.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorldService service =(HelloWorldService) con.getBean("hello");
        String m1= service.InfoData();
        System.out.println(m1);
        service.setName("Spring ");
        service.setAddress("Java");
        m1=service.InfoData();
        System.out.println(m1);
        Profile reg=(Profile) con.getBean("register");
        String m2=reg.Register();
        reg.setFname("Sourabh");
        reg.setLname("Sinha");
        reg.setEmailid("Sourbah12Sinha@gmail.com");
        reg.setMobileno("7903832968");
        m2=reg.Register();
        System.out.println(m2);
        	
    }
}
