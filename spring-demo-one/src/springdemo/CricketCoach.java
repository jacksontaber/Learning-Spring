package springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach Constructor");
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach Setter email");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach Setter Team");
		this.team = team;
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach Setter fortuneService");
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
