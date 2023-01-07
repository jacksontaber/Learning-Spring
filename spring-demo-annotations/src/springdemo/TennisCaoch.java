package springdemo;

import org.springframework.stereotype.Component;

@Component("thatTennisCoach")
public class TennisCaoch implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice Tennis";
	}

}
