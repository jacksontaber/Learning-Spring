package springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new BaseballCoach();
		
		Coach theTrackCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theTrackCoach.getDailyWorkout());

	}

}
