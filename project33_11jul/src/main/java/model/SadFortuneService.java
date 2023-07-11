package model;

public class SadFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		return "Bad day";
	}
}
