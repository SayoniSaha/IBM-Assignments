package org.spring.project32_11jul;

/**
 * Hello world!
 *
 */

import model.Car;
import model.Coach;
import model.BasketBallCoach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        try {        	
        	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach myCoach=context.getBean("theCoach",Coach.class);
			System.out.println(myCoach.getDailyWorkOut());
        	Car car = context.getBean("c",Car.class);
        	System.out.println(car.getDetails());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
}
