package org.spring.project33_11jul;

import model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
    	
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Person person=context.getBean("p",Person.class);
        System.out.println(person);
    }
}
