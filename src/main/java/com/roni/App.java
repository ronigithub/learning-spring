package com.roni;

import com.roni.learning.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // spring.xml can be any name

        Vehicle obj = (Vehicle) context.getBean("car");
        obj.drive();
    }
}