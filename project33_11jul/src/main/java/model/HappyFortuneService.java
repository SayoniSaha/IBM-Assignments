package model;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Good day";
	}
}
