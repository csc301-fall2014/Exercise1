package csc301.exercise1;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyTripAdvisor {

	private static String tripAdvisorType;
	
	
	@BeforeClass
	public static void init(){
		// Load the type of trip advisor we will be testing from an environment variable
		tripAdvisorType = System.getenv("TRIP_ADVISOR_IMPL");
		// Set s default, if the environment variable wasn't set up
		tripAdvisorType = tripAdvisorType == null ? "MyTripAdvisor" : tripAdvisorType;
	}
	
	
	
	@Test
	public void test() {
		TripAdvisor a = TripAdvisorFactory.newTripAdvisor(tripAdvisorType);
		System.out.println("Our TripAdvisor's class is " + a.getClass());
	}
	

}
