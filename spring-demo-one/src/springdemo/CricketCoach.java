package springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAdress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach Constructor");
	}
	
	
	public String getEmailAdress() {
		return emailAdress;
	}


	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach Setter email");
		this.emailAdress = emailAdress;
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
