package springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach Constructor");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach Setter");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
