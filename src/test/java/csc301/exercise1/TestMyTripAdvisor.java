package csc301.exercise1;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyTripAdvisor {

	static ConfigurationFileBasedTripAdvisorFactory factory;
	
	
	@BeforeClass
	public static void init() throws FileNotFoundException, IOException{
		factory = new ConfigurationFileBasedTripAdvisorFactory(System.getenv("TEST_TRIP_ADVISOR_CONF"));
	}
	
	
	
	@Test
	public void test() {
		TripAdvisor a = factory.newTripAdvisor();
		System.out.println("Our TripAdvisor's class is " + a.getClass() + "\n" + a);
	}
	

}
