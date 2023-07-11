package org.spring.project32_11jul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import model.Coach;


public class App {
    public static void main( String[] args ) {
        try {        	
//        	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//			Coach myCoach=context.getBean("theCoach",Coach.class);
//			System.out.println(myCoach.getDailyWorkOut());
//        	Car car = context.getBean("c",Car.class);
//        	System.out.println(car.getDetails());
//        	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//            Coach myCoach=context.getBean("theCoach",Coach.class);
//            System.out.println(myCoach.getDailyWorkOut());
//            System.out.println(myCoach.getDailyFortune());
        	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            Coach myCoach = context.getBean("theCoach", Coach.class);
            System.out.println(myCoach.getDailyWorkOut());
            System.out.println(myCoach.getDailyFortune());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
}
