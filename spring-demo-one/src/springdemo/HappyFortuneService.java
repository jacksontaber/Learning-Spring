package springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Test Fortune";
	}

}
