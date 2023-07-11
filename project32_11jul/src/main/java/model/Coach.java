package model;

import org.springframework.stereotype.Component;

@Component
public interface Coach {
	
	public String getDailyWorkOut();	
	public String getDailyFortune();

}
